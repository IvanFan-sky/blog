package com.example.blog.service.impl;

import com.example.blog.entity.Message;
import com.example.blog.dao.MessageMapper;
import com.example.blog.service.MessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
