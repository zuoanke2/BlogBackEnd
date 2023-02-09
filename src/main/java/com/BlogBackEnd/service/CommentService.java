package com.BlogBackEnd.service;

import com.BlogBackEnd.model.CommentBean;

import java.util.List;

public interface CommentService {
    List<CommentBean> queryCommentListByBlog(int blogId);
}
