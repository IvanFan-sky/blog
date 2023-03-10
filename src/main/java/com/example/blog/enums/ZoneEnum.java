package com.example.blog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 时区枚举
 *
 * @author spark
 * @date 2023/03/9
 */
@Getter
@AllArgsConstructor
public enum ZoneEnum {
    /**
     * 上海
     */
    SHANGHAI("Asia/Shanghai", "中国上海");

    /**
     * 时区
     */
    private final String zone;

    /**
     * 描述
     */
    private final String desc;
}
