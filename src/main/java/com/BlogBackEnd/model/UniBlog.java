package com.BlogBackEnd.model;

import java.util.List;

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
