package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.service.BlogService;
import com.BlogBackEnd.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BlogBackEndController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CommentService commentService;

    @GetMapping("blogs/get")
    public BlogBean queryBlog(@RequestParam("blogId") int blogId) {
        return blogService.queryBlog(blogId);
    }

    @GetMapping("comment/get")
    public List<CommentBean> queryCommentListByBlog(@RequestParam("blogId") int blogId) {
        return commentService.queryCommentListByBlog(blogId);
    }
}
