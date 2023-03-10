package com.example.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * qq token信息
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QQTokenDTO {

    /**
     * openid
     */
    private String openid;

    /**
     * 客户端id
     */
    private String client_id;

}
