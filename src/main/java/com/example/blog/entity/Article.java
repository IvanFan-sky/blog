package com.example.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author spark
 * @since 2023-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_article")
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "作者")
    private Integer userId;

    @ApiModelProperty(value = "文章分类")
    private Integer categoryId;

    @ApiModelProperty(value = "文章缩略图")
    private String articleCover;

    @ApiModelProperty(value = "标题")
    private String articleTitle;

    @ApiModelProperty(value = "内容")
    private String articleContent;

    @ApiModelProperty(value = "文章类型 1原创 2转载 3翻译")
    private Boolean type;

    @ApiModelProperty(value = "原文链接")
    private String originalUrl;

    @ApiModelProperty(value = "是否置顶 0否 1是")
    private Boolean isTop;

    @ApiModelProperty(value = "是否删除  0否 1是")
    private Boolean isDelete;

    @ApiModelProperty(value = "状态值 1公开 2私密 3评论可见")
    private Boolean status;

    @ApiModelProperty(value = "发表时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
