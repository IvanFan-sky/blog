package com.example.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author spark
 * @since 2023-03-08
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
