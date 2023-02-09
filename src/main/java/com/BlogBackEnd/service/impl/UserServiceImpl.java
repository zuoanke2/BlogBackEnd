package com.BlogBackEnd.service.impl;

import com.BlogBackEnd.mapper.CommentMapper;
import com.BlogBackEnd.mapper.UserMapper;
import com.BlogBackEnd.service.UserService;

import javax.annotation.Resource;

/**
 * @className UserServiceImpl
 * @author Anke Zuo
 * @description implementation of user service
 * @updateTime 2/9/23 02:13
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public String queryUserName(int userId) {
        return userMapper.queryUserName(userId);
    }
}
