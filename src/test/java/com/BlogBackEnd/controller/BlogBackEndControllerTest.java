package com.BlogBackEnd.controller;

import com.BlogBackEnd.httpUtils.HttpUtil;
import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.CommentVO;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlogBackEndControllerTest {
    @Autowired
    private BlogBackEndController blogBackEndController;
    @Test
    void queryBlog() {
        BlogBean blogBean = blogBackEndController.queryBlog(1);
        String blogBeanJson = JSON.toJSONString(blogBean);
        String expStr = "{\"authorId\":2,\"blogId\":0,\"content\":\"this article is just for test\",\"title\":\"test blog1\"}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(blogBeanJson)), "queryBlog() pass!");
    }

    @Test
    void addComment() {
        CommentVO commentVO = new CommentVO();
        commentVO.setBlogId(1);
        commentVO.setComment("unit test comment");
        String res = blogBackEndController.addComment(commentVO);
        String expStr = "Error!";
        Assert.isTrue(!expStr.equals(res), "addComment() pass!");
    }
}