package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.model.CommentVO;
import com.BlogBackEnd.model.UserComments;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @className CommentControllerTest
 * @author Anke Zuo
 * @description unit tests for comment module
 * @updateTime 2/9/23 02:12
 * @version 1.0
 */
@SpringBootTest
class CommentControllerTest {
    @Autowired
    CommentController commentController;

    @Test
    void queryCommentListByBlog() {
        List<CommentBean> commentBeanList = commentController.queryCommentListByBlog(1);
        String commentBeanJson = JSON.toJSONString(commentBeanList.get(0));
        String expStr = "{\"authorId\":1,\"blogId\":1,\"cmtId\":1,\"comment\":\"this is just a test comment\"}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(commentBeanJson)));
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
        CommentVO commentVO = new CommentVO();
        commentVO.setBlogId(1);
        commentVO.setComment("unit test comment updating");
        String res = commentController.updateComment(commentVO);
        String expStr = "Error!";
        Assert.isTrue(!expStr.equals(res), "updateComment() pass!");
    }

    //Please add a comment first and get the cmtid then do the test for deleteComment()
//    @Test
//    void deleteComment() {
//        String res = commentController.deleteComment();
//        String expStr = "Error!";
//        Assert.isTrue(!expStr.equals(res), "updateComment() pass!");
//    }

    @Test
    void queryUserComments() {
        List<UserComments> userCommentsList = commentController.queryUserComments(1);
        String userCommentJson = JSON.toJSONString(userCommentsList.get(0));
        String expStr = "{\"blogAuthor\":\"bloger1\",\"blogTitle\":\"test blog1\",\"yourComment\":\"this is just a test comment\"}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(userCommentJson)));
    }
}