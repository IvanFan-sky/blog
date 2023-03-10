package com.example.blog.service.impl;

import com.example.blog.entity.Article;
import com.example.blog.dao.ArticleMapper;
import com.example.blog.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
