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
 * 页面
 * </p>
 *
 * @author spark
 * @since 2023-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_page")
@ApiModel(value="Page对象", description="页面")
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "页面id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "页面名")
    private String pageName;

    @ApiModelProperty(value = "页面标签")
    private String pageLabel;

    @ApiModelProperty(value = "页面封面")
    private String pageCover;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
