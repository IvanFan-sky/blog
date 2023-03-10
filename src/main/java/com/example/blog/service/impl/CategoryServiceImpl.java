package com.example.blog.service.impl;

import com.example.blog.entity.Category;
import com.example.blog.dao.CategoryMapper;
import com.example.blog.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author spark
 * @since 2023-03-09
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
