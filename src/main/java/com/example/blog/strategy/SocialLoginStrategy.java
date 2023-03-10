package com.example.blog.strategy;

import com.example.blog.dto.UserInfoDTO;

/**
 * 第三方登录策略
 *
 * @author spark
 * @date 2023/03/09
 * @since 1.0.0
 */

public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);

}
