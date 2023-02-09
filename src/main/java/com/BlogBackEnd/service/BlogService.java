package com.BlogBackEnd.service;

import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.UniBlog;

import java.util.List;

public interface BlogService {
    BlogBean queryBlog(int blogId);

    UniBlog queryUniBlog(int blogId);

    List<BlogBean> queryBlogsByUser(int userId);
}
