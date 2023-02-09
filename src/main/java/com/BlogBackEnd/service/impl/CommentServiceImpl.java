package com.BlogBackEnd.service.impl;

import com.BlogBackEnd.mapper.CommentMapper;
import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;
    @Override
    public List<CommentBean> queryCommentListByBlog(int blogId) {
        List<CommentBean> commentBeanList =  commentMapper.queryCommendListByBlogId(blogId);
        return commentBeanList;
    }
    @Override
    public void addComment(int authorId, int blogId, String comment) {
        commentMapper.addComment(authorId, blogId, comment);
    }

    @Override
    public void updateComment(int cmtId, String comment) {
        commentMapper.updateComment(cmtId, comment);
    }
}
