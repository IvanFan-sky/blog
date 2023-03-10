/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: ArticleStatusEnum
 * Author:   FanLian
 * Date:     2023/3/9 16:46
 * Description: 文章类型枚举
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 〈一句话功能简述〉<br> 
 * 〈文章状态枚举〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Getter
@AllArgsConstructor
public enum ArticleStatusEnum {
    /**
     * 公开
     */
    PUBLIC(1, "公开"),
    /**
     * 私密
     */
    SECRET(2, "私密"),
    /**
     * 草稿
     */
    DRAFT(3, "草稿");

    /**
     * 状态
     */
    private final Integer status;

    /**
     * 描述
     */
    private final String desc;
}
