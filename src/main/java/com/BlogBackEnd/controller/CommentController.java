package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.model.CommentVO;
import com.BlogBackEnd.model.UserComments;
import com.BlogBackEnd.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment/get/{blogId}")
    public List<CommentBean> queryCommentListByBlog(@PathVariable("blogId") int blogId) {
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

    @GetMapping("/comment/delete/{cmtId}")
    public String deleteComment(@PathVariable("cmtId") int cmtId) {
        commentService.deleteComment(cmtId);
        return "Deleted!";
    }

    @GetMapping("/comment/queryByUser/{userId}")
    public List<UserComments> queryUserComments(@PathVariable("userId") int userId) {
        return commentService.queryUserComments(userId);
    }
}
