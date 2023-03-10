/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: QQLoginVO
 * Author:   FanLian
 * Date:     2023/3/9 15:04
 * Description: QQ登陆
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 〈QQ登陆〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "QQ登陆")
public class QQLoginVO {
    /**
     * openId
     */
    @NotBlank(message = "openId不能为空")
    @ApiModelProperty(name = "openId", value = "qq openId", required = true, dataType = "String")
    private String openId;


    /**
     * accessToken
     */
    @NotBlank(message = "accessToken不能为空")
    @ApiModelProperty(name = "accessToken", value = "qq accessToken", required = true, dataType = "String")
    private String accessToken;
}
