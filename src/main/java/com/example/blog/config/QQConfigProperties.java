/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: QQConfigProperties
 * Author:   FanLian
 * Date:     2023/3/10 17:50
 * Description: qq配置文件
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈qq配置文属性〉
 *
 * @author spark
 * @create 2023/3/10
 * @since 1.0.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "qq")
public class QQConfigProperties {

    /**
     * QQ appId
     */
    private String appId;

    /**
     * 校验token地址
     */
    private String checkTokenUrl;

    /**
     * QQ用户信息地址
     */
    private String userInfoUrl;
}
