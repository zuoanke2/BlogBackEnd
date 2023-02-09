package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.BlogBean;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlogControllerTest {
    @Autowired
    BlogController blogController;

    @Test
    void queryBlog() {
        BlogBean blogBean = blogController.queryBlog(1);
        String blogBeanJson = JSON.toJSONString(blogBean);
        String expStr = "{\"authorId\":2,\"blogId\":0,\"content\":\"this article is just for test\",\"title\":\"test blog1\"}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(blogBeanJson)), "queryBlog() pass!");
    }

    @Test
    void queryBlogsByUser() {
    }

    @Test
    void queryUniBlogVO() {
    }
}