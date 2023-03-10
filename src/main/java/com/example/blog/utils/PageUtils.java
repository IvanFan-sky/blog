/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: PageUtils
 * Author:   FanLian
 * Date:     2023/3/10 16:49
 * Description: 分页工具类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈分页工具类〉
 *
 * @author spark
 * @create 2023/3/10
 * @since 1.0.0
 */
public class PageUtils {
    private static final ThreadLocal<Page<?>> PAGE_HOLDER = new ThreadLocal<>();
    public static void setCurrentPage(Page<?> page) {
        PAGE_HOLDER.set(page);
    }

    public static Page<?> getPage() {
        Page<?> page = PAGE_HOLDER.get();
        if (Objects.isNull(page)) {
            setCurrentPage(new Page<>());
        }
        return PAGE_HOLDER.get();
    }

    public static Long getCurrent() {
        return getPage().getCurrent();
    }

    public static Long getSize() {
        return getPage().getSize();
    }

    public static Long getLimitCurrent() {
        return (getCurrent() - 1) * getSize();
    }

    public static void remove() {
        PAGE_HOLDER.remove();
    }
}
