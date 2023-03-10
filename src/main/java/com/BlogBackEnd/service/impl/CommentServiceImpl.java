package com.BlogBackEnd.service.impl;

import com.BlogBackEnd.mapper.CommentMapper;
import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.model.UniBlog;
import com.BlogBackEnd.model.UserComments;
import com.BlogBackEnd.service.BlogService;
import com.BlogBackEnd.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @className CommentServiceImpl
 * @author Anke Zuo
 * @description implementation of comment service
 * @updateTime 2/9/23 02:13
 * @version 1.0
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private BlogService blogService;
    @Override
    public List<CommentBean> queryCommentListByBlog(int blogId) {
        List<CommentBean> commentBeanList =  commentMapper.queryCommendListByBlogId(blogId);
        return commentBeanList;
    }

    @Transactional
    @Override
    public void addComment(int authorId, int blogId, String comment) {
        commentMapper.addComment(authorId, blogId, comment);
    }

    @Transactional
    @Override
    public void updateComment(int cmtId, String comment) {
        commentMapper.updateComment(cmtId, comment);
    }

    @Transactional
    @Override
    public void deleteComment(int cmtId) {
        commentMapper.deleteComment(cmtId);
    }

    @Transactional
    @Override
    public List<UserComments> queryUserComments(int userId) {
        List<UserComments> userCommentsList = new ArrayList<>();
        List<CommentBean> commentBeanList = commentMapper.queryCommendListByUserId(userId);

        for (CommentBean commentBean : commentBeanList) {
            UserComments userComments = new UserComments();
            UniBlog uniBlog = blogService.queryUniBlog(commentBean.getBlogId());
            userComments.setBlogAuthor(uniBlog.getBlogAuthor());
            userComments.setBlogTitle(uniBlog.getBlogTitle());
            userComments.setYourComment(commentBean.getComment());
            userCommentsList.add(userComments);
        }
        return userCommentsList;
    }
}
