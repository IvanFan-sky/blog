/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: BlogInfoServiceImpl
 * Author:   FanLian
 * Date:     2023/3/9 16:36
 * Description: 博客信息服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.blog.dao.*;
import com.example.blog.dto.BlogBackInfoDTO;
import com.example.blog.dto.BlogHomeInfoDTO;
import com.example.blog.entity.Article;
import com.example.blog.service.BlogInfoService;
import com.example.blog.service.PageService;
import com.example.blog.service.RedisService;
import com.example.blog.service.UniqueViewService;
import com.example.blog.vo.BlogInfoVO;
import com.example.blog.vo.PageVO;
import com.example.blog.vo.WebsiteConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

import static com.example.blog.constant.CommonConst.FALSE;
import static com.example.blog.constant.RedisPrefixConst.BLOG_VIEWS_COUNT;
import static com.example.blog.enums.ArticleStatusEnum.PUBLIC;
/**
 * 〈一句话功能简述〉<br> 
 * 〈博客信息服务〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Service
public class BlogInfoServiceImpl implements BlogInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private TagMapper tagMapper;
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private UniqueViewService uniqueViewService;
    @Autowired
    private RedisService redisService;
    @Autowired
    private WebsiteConfigMapper websiteConfigMapper;
    @Resource
    private HttpServletRequest request;
    @Autowired
    private PageService pageService;


    @Override
    public BlogHomeInfoDTO getBlogHomeInfo() {
        // 查询文章数量
        Integer articleCount = articleMapper.selectCount(new LambdaQueryWrapper<Article>()
                .eq(Article::getStatus, PUBLIC.getStatus())
                .eq(Article::getIsDelete, FALSE));
        // 查询分类数量
        Integer categoryCount = categoryMapper.selectCount(null);
        // 查询标签数量
        Integer tagCount = tagMapper.selectCount(null);
        // 查询访问量
        Object count = redisService.get(BLOG_VIEWS_COUNT);
        String viewsCount = Optional.ofNullable(count).orElse(0).toString();
        // 查询网站配置
        WebsiteConfigVO websiteConfig = this.getWebsiteConfig();
        // 查询页面图片
        List<PageVO> pageVOList = pageService.listPages();

        // 封装数据
        return BlogHomeInfoDTO.builder()
                .articleCount(articleCount)
                .categoryCount(categoryCount)
                .tagCount(tagCount)
                .viewsCount(viewsCount)
                .websiteConfig(websiteConfig)
                .pageList(pageVOList)
                .build();
    }

    @Override
    public BlogBackInfoDTO getBlogBackInfo() {
        return null;
    }

    @Override
    public void updateWebsiteConfig(WebsiteConfigVO websiteConfigVO) {

    }

    @Override
    public WebsiteConfigVO getWebsiteConfig() {
        return null;
    }

    @Override
    public String getAbout() {
        return null;
    }

    @Override
    public void updateAbout(BlogInfoVO blogInfoVO) {

    }

    @Override
    public void report() {

    }
}
