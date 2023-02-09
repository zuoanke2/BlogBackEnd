package com.BlogBackEnd.model;

import java.util.List;

/**
 * @className UniBlog
 * @author Anke Zuo
 * @description detail info of a blog
 * @updateTime 2/9/23 02:08
 * @version 1.0
 */
public class UniBlog {
    private String blogTitle;
    private String blogAuthor;
    private String blogContent;
    private List<UniComment> commentList;

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public List<UniComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<UniComment> commentList) {
        this.commentList = commentList;
    }
}
