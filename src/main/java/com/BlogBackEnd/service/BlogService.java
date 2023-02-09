package com.BlogBackEnd.service;

import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.UniBlog;

public interface BlogService {
    BlogBean queryBlog(int blogId);

    UniBlog queryUniBlogVO(int blogId);
}
