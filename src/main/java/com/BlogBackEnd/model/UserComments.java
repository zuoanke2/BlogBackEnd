package com.BlogBackEnd.model;

public class UserComments {
    private String blogTitle;
    private String blogAuthor;
    private String yourComment;

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

    public String getYourComment() {
        return yourComment;
    }

    public void setYourComment(String yourComment) {
        this.yourComment = yourComment;
    }
}
