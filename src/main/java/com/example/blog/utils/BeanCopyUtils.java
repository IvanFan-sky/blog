/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: BeanCopyUtils
 * Author:   FanLian
 * Date:     2023/3/9 16:56
 * Description: 复制对象或集合属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈复制对象或集合属性〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
public class BeanCopyUtils {
    /**
     * 复制对象
     *
     * @param source 源
     * @param target 目标
     * @return {@link T}
     */
    public static <T> T copyObject(Object source, Class<T> target) {
        T temp = null;
        try {
            temp = target.newInstance();
            if (null != source) {
                org.springframework.beans.BeanUtils.copyProperties(source, temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

    /**
     * 拷贝集合
     *
     * @param source 源
     * @param target 目标
     * @return {@link List <T>} 集合
     */
    public static <T, S> List<T> copyList(List<S> source, Class<T> target) {
        List<T> list = new ArrayList<>();
        if (null != source && source.size() > 0) {
            for (Object obj : source) {
                list.add(BeanCopyUtils.copyObject(obj, target));
            }
        }
        return list;
    }
}
