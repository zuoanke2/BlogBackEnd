package com.BlogBackEnd.service.impl;

import com.BlogBackEnd.mapper.BlogMapper;
import com.BlogBackEnd.mapper.CommentMapper;
import com.BlogBackEnd.mapper.UserMapper;
import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.model.UniBlog;
import com.BlogBackEnd.model.UniComment;
import com.BlogBackEnd.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private CommentMapper commentMapper;
    @Override
    public BlogBean queryBlog(int blogId) {
        BlogBean blogContent = blogMapper.queryBlog(blogId);
        return blogContent;
    }

    @Override
    public UniBlog queryUniBlog(int blogId) {
        UniBlog ubv = new UniBlog();
        BlogBean blogBean = queryBlog(blogId);

        ubv.setBlogTitle(blogBean.getTitle());
        String blogAuthorName = userMapper.queryUserName(blogBean.getAuthorId());
        ubv.setBlogAuthor(blogAuthorName);
        ubv.setBlogContent(blogBean.getContent());
        List<CommentBean> commentList = commentMapper.queryCommendListByBlogId(blogId);
        List<UniComment> uniCmtList = new ArrayList<>();
        for (CommentBean commentBean : commentList) {
            UniComment ucmt = new UniComment();
            ucmt.setComment(commentBean.getComment());
            ucmt.setCommentAuthorName(userMapper.queryUserName(commentBean.getAuthorId()));
            uniCmtList.add(ucmt);
        }
        ubv.setCommentList(uniCmtList);
        return ubv;
    }

    @Override
    public List<BlogBean> queryBlogsByUser(int userId) {
        return blogMapper.queryBlogsByUser(userId);
    }
}
