package com.BlogBackEnd.service;

import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.UniBlog;

import java.util.List;

/**
 * @className BlogService
 * @author Anke Zuo
 * @description blog relates service
 * @updateTime 2/9/23 02:10
 * @version 1.0
 */
public interface BlogService {
    BlogBean queryBlog(int blogId);

    UniBlog queryUniBlog(int blogId);

    List<BlogBean> queryBlogsByUser(int userId);
}
