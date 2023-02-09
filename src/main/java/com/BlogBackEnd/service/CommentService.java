package com.BlogBackEnd.service;

import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.model.UserComments;

import java.util.List;

/**
 * @className CommentService
 * @author Anke Zuo
 * @description comment relates service
 * @updateTime 2/9/23 02:10
 * @version 1.0
 */
public interface CommentService {
    List<CommentBean> queryCommentListByBlog(int blogId);

    void addComment(int authorId, int blogId, String comment);

    void updateComment(int cmtId, String comment);

    void deleteComment(int cmtId);

    List<UserComments> queryUserComments(int userId);
}
