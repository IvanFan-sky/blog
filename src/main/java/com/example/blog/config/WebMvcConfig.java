/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: WebMvcConfig
 * Author:   FanLian
 * Date:     2023/3/10 16:35
 * Description: web mvc配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.config;

import com.example.blog.handler.PageableHandlerInterceptor;
import com.example.blog.handler.WebSecurityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈web mvc配置〉
 *
 * @author spark
 * @create 2023/3/10
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    public WebSecurityHandler getWebSecurityHandler() {
        return new WebSecurityHandler();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOriginPatterns("*")
                .allowedMethods("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PageableHandlerInterceptor());
        registry.addInterceptor(getWebSecurityHandler());
    }

}
