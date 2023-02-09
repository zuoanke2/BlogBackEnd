package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.BlogBean;
import com.BlogBackEnd.model.UniBlog;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlogControllerTest {
    @Autowired
    BlogController blogController;

    @Test
    void queryBlog() {
        BlogBean blogBean = blogController.queryBlog(1);
        String blogBeanJson = JSON.toJSONString(blogBean);
        String expStr = "{\"authorId\":2,\"content\":\"this article is just for test\",\"id\":1,\"title\":\"test blog1\"}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(blogBeanJson)), "queryBlog() pass!");
    }

    @Test
    void queryBlogsByUser() {
        List<BlogBean> blogBeanList = blogController.queryBlogsByUser(1);
        String blogBeanJson = JSON.toJSONString(blogBeanList.get(0));
        String expStr = "{\"authorId\":1,\"content\":\"this is the first blog of zak\",\"id\":4,\"title\":\"zak blog1\"}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(blogBeanJson)));
    }

    @Test
    void queryUniBlogVO() {
        UniBlog ubg = blogController.queryUniBlogVO(4);
        String ubgJson = JSON.toJSONString(ubg);
        String expStr = "{\"blogAuthor\":\"zuoanke\",\"blogContent\":\"this is the first blog of zak\",\"blogTitle\":\"zak blog1\",\"commentList\":[]}";
        Assert.isTrue(JSON.parseObject(expStr).equals(JSON.parseObject(ubgJson)));
    }
}