package com.example.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author spark
 * @since 2023-03-09
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
