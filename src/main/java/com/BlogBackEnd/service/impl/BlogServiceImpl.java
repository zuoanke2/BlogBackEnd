package com.BlogBackEnd.service.impl;

import com.BlogBackEnd.mapper.BlogMapper;
import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;
    @Override
    public BlogBean queryBlog(int blogId) {
        BlogBean blogContent = blogMapper.queryBlog(blogId);
        return blogContent;
    }
}
