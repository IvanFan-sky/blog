package com.example.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.dao.PageMapper;
import com.example.blog.entity.Page;
import com.example.blog.service.PageService;
import com.example.blog.service.RedisService;
import com.example.blog.utils.BeanCopyUtils;
import com.example.blog.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

import static com.example.blog.constant.RedisPrefixConst.PAGE_COVER;

/**
 * <p>
 * 页面 服务实现类
 * </p>
 *
 * @author spark
 * @since 2023-03-09
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements PageService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private PageMapper pageMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<PageVO> listPages() {
        List<PageVO> pageVOList;
        // 查找缓存信息，不存在则从mysql读取，更新缓存
        Object pageList = redisService.get(PAGE_COVER);
        if (Objects.nonNull(pageList)) {
            pageVOList = JSON.parseObject(pageList.toString(), List.class);
        } else {
            pageVOList = BeanCopyUtils.copyList(pageMapper.selectList(null), PageVO.class);
            redisService.set(PAGE_COVER, JSON.toJSONString(pageVOList));
        }
        return pageVOList;
    }
}
