package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.CommentVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentControllerTest {
    @Autowired
    CommentController commentController;

    @Test
    void queryCommentListByBlog() {
    }

    @Test
    void addComment() {
        CommentVO commentVO = new CommentVO();
        commentVO.setBlogId(1);
        commentVO.setComment("unit test comment");
        String res = commentController.addComment(commentVO);
        String expStr = "Error!";
        Assert.isTrue(!expStr.equals(res), "addComment() pass!");
    }

    @Test
    void updateComment() {
    }

    @Test
    void deleteComment() {
    }

    @Test
    void queryUserComments() {
    }
}