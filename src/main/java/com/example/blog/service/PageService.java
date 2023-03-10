package com.example.blog.service;

import com.example.blog.entity.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.blog.vo.PageVO;

import java.util.List;

/**
 * <p>
 * 页面 服务类
 * </p>
 *
 * @author spark
 * @since 2023-03-09
 */
public interface PageService extends IService<Page> {
    /**
     * 获取页面列表
     *
     * @return {@link List<PageVO>} 页面列表
     */
    List<PageVO> listPages();
}
