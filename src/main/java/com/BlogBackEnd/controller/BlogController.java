package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.*;
import com.BlogBackEnd.service.BlogService;
import com.BlogBackEnd.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("blog/get/{blogId}")
    public BlogBean queryBlog(@PathVariable("blogId") int blogId) {
        return blogService.queryBlog(blogId);
    }

    @GetMapping("blog/getbyuser/{userId}")
    public List<BlogBean> queryBlogsByUser(@PathVariable("userId")int userId) {
        return blogService.queryBlogsByUser(userId);
    }

    @GetMapping("blog/getuniblog/{blogId}")
    public UniBlog queryUniBlogVO(@PathVariable("blogId") int blogId) {
        return blogService.queryUniBlog(blogId);
    }
}
