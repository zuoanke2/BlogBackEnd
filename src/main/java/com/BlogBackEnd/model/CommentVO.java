package com.BlogBackEnd.model;

/**
 * @className CommentVO 
 * @author Anke Zuo
 * @description view object of comment
 * @updateTime 2/9/23 02:07 
 * @version 1.0
 */
public class CommentVO {
    private int cmtId;
    private int authorId;
    private int blogId;
    private String comment;

    public int getCmtId() {
        return cmtId;
    }

    public void setCmtId(int cmtId) {
        this.cmtId = cmtId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
