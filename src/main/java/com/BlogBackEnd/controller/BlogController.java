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

    /**
     * @methodName queryBlog
     * @author Anke Zuo
     * @Param blogId
     * @version 1.0
     * @description query single blog info (title, content, authorId) by blogId
     * @updateTime 2/9/23 01:57
     * @return: com.BlogBackEnd.model.BlogBean
     * @throws
     */
    @GetMapping("blog/get/{blogId}")
    public BlogBean queryBlog(@PathVariable("blogId") int blogId) {
        return blogService.queryBlog(blogId);
    }

    /**
     * @methodName queryBlogsByUser
     * @author Anke Zuo
     * @Param userId
     * @version 1.0
     * @description query all blogs of one single user
     * @updateTime 2/9/23 01:58
     * @return: java.util.List<com.BlogBackEnd.model.BlogBean>
     * @throws
     */

    @GetMapping("blog/getbyuser/{userId}")
    public List<BlogBean> queryBlogsByUser(@PathVariable("userId")int userId) {
        return blogService.queryBlogsByUser(userId);
    }

    /**
     * @methodName queryUniBlogVO
     * @author Anke Zuo
     * @Param blogId
     * @version 1.0
     * @description query completed info of a blog, include title, content, author's name and all the comments of this blog
     * @updateTime 2/9/23 01:58
     * @return: com.BlogBackEnd.model.UniBlog
     * @throws
     */
    @GetMapping("blog/getuniblog/{blogId}")
    public UniBlog queryUniBlogVO(@PathVariable("blogId") int blogId) {
        return blogService.queryUniBlog(blogId);
    }
}
