package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.*;
import com.BlogBackEnd.service.BlogService;
import com.BlogBackEnd.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogBackEndController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CommentService commentService;

    @GetMapping("blog/get")
    public BlogBean queryBlog(@RequestParam("blogId") int blogId) {
        return blogService.queryBlog(blogId);
    }

    @GetMapping("blog/getbyuser")
    public List<BlogBean> queryBlogsByUser(@RequestParam("userId")int userId) {
        return blogService.queryBlogsByUser(userId);
    }

    @GetMapping("blog/getuniblog")
    public UniBlog queryUniBlogVO(@RequestParam("blogId") int blogId) {
        return blogService.queryUniBlog(blogId);
    }

    @GetMapping("comment/get")
    public List<CommentBean> queryCommentListByBlog(@RequestParam("blogId") int blogId) {
        return commentService.queryCommentListByBlog(blogId);
    }

    @PostMapping("/comment/add")
    public String addComment(@RequestBody CommentVO commentVO) {
        commentService.addComment(commentVO.getAuthorId(), commentVO.getBlogId(), commentVO.getComment());
        return "Added!";
    }

    @PostMapping("/comment/update")
    public String updateComment(@RequestBody CommentVO commentVO) {
        commentService.updateComment(commentVO.getCmtId(), commentVO.getComment());
        return "Updated!";
    }

    @GetMapping("/comment/delete")
    public String deleteComment(@RequestParam("cmtId") int cmtId) {
        commentService.deleteComment(cmtId);
        return "Deleted!";
    }

    @GetMapping("/comment/queryByUser")
    public List<UserComments> queryUserComments(@RequestParam("userId") int userId) {
        return commentService.queryUserComments(userId);
    }
}
