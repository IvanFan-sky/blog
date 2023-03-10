/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: UniqueViewDTO
 * Author:   FanLian
 * Date:     2023/3/9 16:31
 * Description: 访问量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈访问量〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UniqueViewDTO {
    /**
     * 日期
     */
    private String day;

    /**
     * 访问量
     */
    private Integer viewsCount;

}
