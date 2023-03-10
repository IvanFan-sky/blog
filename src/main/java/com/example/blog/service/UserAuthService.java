package com.example.blog.service;

import com.example.blog.dto.UserInfoDTO;
import com.example.blog.entity.UserAuth;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.blog.vo.QQLoginVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author spark
 * @since 2023-03-08
 */
public interface UserAuthService extends IService<UserAuth> {

    /**
     * qq登录
     *
     * @param qqLoginVO qq登录信息
     * @return 用户登录信息
     */
    UserInfoDTO qqLogin(QQLoginVO qqLoginVO);

}
