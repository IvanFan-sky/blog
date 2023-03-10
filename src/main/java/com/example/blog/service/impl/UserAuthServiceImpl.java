package com.example.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.dao.UserAuthMapper;
import com.example.blog.dao.UserInfoMapper;
import com.example.blog.dao.UserRoleMapper;
import com.example.blog.dto.UserInfoDTO;
import com.example.blog.entity.UserAuth;
import com.example.blog.enums.LoginTypeEnum;
import com.example.blog.service.BlogInfoService;
import com.example.blog.service.RedisService;
import com.example.blog.service.UserAuthService;
import com.example.blog.strategy.context.SocialLoginStrategyContext;
import com.example.blog.vo.QQLoginVO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author spark
 * @since 2023-03-08
 */
@Service
public class UserAuthServiceImpl extends ServiceImpl<UserAuthMapper, UserAuth> implements UserAuthService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private UserAuthMapper userAuthMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private BlogInfoService blogInfoService;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private SocialLoginStrategyContext socialLoginStrategyContext;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public UserInfoDTO qqLogin(QQLoginVO qqLoginVO) {
        return socialLoginStrategyContext.executeLoginStrategy(JSON.toJSONString(qqLoginVO), LoginTypeEnum.QQ);
    }
}
