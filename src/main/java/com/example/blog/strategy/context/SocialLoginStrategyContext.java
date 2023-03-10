/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: SocialLoginStrategyContext
 * Author:   FanLian
 * Date:     2023/3/9 15:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.strategy.context;

import com.example.blog.dto.UserInfoDTO;
import com.example.blog.enums.LoginTypeEnum;
import com.example.blog.strategy.SocialLoginStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈第三方登录策略上下文〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Service
public class SocialLoginStrategyContext {

    @Autowired
    private Map<String, SocialLoginStrategy> socialLoginStrategyMap;

    /**
     * 执行第三方登录策略
     *
     * @param data          数据
     * @param loginTypeEnum 登录枚举类型
     * @return {@link UserInfoDTO} 用户信息
     */
    public UserInfoDTO executeLoginStrategy(String data, LoginTypeEnum loginTypeEnum) {
        return socialLoginStrategyMap.get(loginTypeEnum.getStrategy()).login(data);
    }
}
