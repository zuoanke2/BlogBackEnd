package com.BlogBackEnd.service.impl;

import com.BlogBackEnd.mapper.CommentMapper;
import com.BlogBackEnd.mapper.UserMapper;
import com.BlogBackEnd.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public String queryUserName(int userId) {
        return userMapper.queryUserName(userId);
    }
}
