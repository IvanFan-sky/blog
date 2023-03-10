/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: ArticleStatisticsDTO
 * Author:   FanLian
 * Date:     2023/3/9 16:30
 * Description: 文章统计
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
 * 〈文章统计〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleStatisticsDTO {
    /**
     * 日期
     */
    private String date;

    /**
     * 数量
     */
    private Integer count;
}
