package com.example.blog.controller;


import com.example.blog.dto.UserInfoDTO;
import com.example.blog.service.UserAuthService;
import com.example.blog.vo.QQLoginVO;
import com.example.blog.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

/**
 *  用户账号控制器
 *
 * @author spark
 * @since 2023-03-08
 */
@Api(tags = "用户账号模块")
@RestController
public class UserAuthController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }

    @Autowired
    private UserAuthService userAuthService;

    /**
     * @Valid 注解表示需要对这个对象的属性进行验证
     */
    /**
     * qq登录
     *
     * @param qqLoginVO qq登录信息
     * @return {@link Result<UserInfoDTO>} 用户信息
     */
    @ApiOperation(value = "qq登陆")
    @RequestMapping("/users/oauth/qq")
    public Result<UserInfoDTO> qqLogin(@Valid @RequestBody QQLoginVO qqLoginVO){
        return Result.ok(userAuthService.qqLogin(qqLoginVO));
    }



}

