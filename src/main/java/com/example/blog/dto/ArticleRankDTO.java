/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: ArticleRankDTO
 * Author:   FanLian
 * Date:     2023/3/9 16:33
 * Description: 文章排行
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
 * 〈文章排行〉
 *
 * @author spark
 * @create 2023/3/9
 * @since 1.0.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleRankDTO {
    /**
     * 标题
     */
    private String articleTitle;

    /**
     * 浏览量
     */
    private Integer viewsCount;

}
