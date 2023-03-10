/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: MybatisPlusConfig
 * Author:   FanLian
 * Date:     2023/3/10 16:17
 * Description: mybatisplusconfig配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 〈一句话功能简述〉<br> 
 * 〈mybatisplusconfig配置类〉
 *
 * @author spark
 * @create 2023/3/10
 * @since 1.0.0
 */
@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
