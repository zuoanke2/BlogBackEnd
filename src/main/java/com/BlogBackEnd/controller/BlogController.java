package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("blogs/get")
    public BlogBean queryBlog(@RequestParam("blogId") int blogId) {
        return blogService.queryBlog(blogId);
    }
}
