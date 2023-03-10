/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: BizException
 * Author:   FanLian
 * Date:     2023/3/9 16:00
 * Description: 全局异常
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.exception;

import com.example.blog.enums.StatusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.example.blog.enums.StatusCodeEnum.FAIL;
/**
 * 〈一句话功能简述〉<br> 
 * 〈业务异常〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Getter
@AllArgsConstructor
public class BizException extends RuntimeException{
    /**
     * 错误码
     */
    private Integer code = FAIL.getCode();
    /**
     * 错误信息
     */
    private final String message;

    public BizException(String message) {
        this.message = message;
    }
    public BizException(StatusCodeEnum statusCodeEnum) {
        this.code = statusCodeEnum.getCode();
        this.message = statusCodeEnum.getDesc();
    }

}
