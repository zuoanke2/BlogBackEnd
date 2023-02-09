package com.BlogBackEnd.model;

import java.util.List;

public class uniBlogVO {
    class uniComment {
        private String commentAuthorName;
        private String comment;
    }
    private String blogTitle;
    private String blogAuthor;
    private List<uniComment> commentList;

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

    public List<uniComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<uniComment> commentList) {
        this.commentList = commentList;
    }
}
