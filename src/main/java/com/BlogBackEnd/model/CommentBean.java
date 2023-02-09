package com.BlogBackEnd.model;

/**
 * @className CommentBean
 * @author Anke Zuo
 * @description info of a comment
 * @updateTime 2/9/23 02:07
 * @version 1.0
 */
public class CommentBean {
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
