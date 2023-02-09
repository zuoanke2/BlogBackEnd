package com.BlogBackEnd.model;

/**
 * @className UniComment
 * @author Anke Zuo
 * @description detail info of a comment
 * @updateTime 2/9/23 02:08
 * @version 1.0
 */
public class UniComment {
    private String commentAuthorName;
    private String comment;

    public String getCommentAuthorName() {
        return commentAuthorName;
    }

    public void setCommentAuthorName(String commentAuthorName) {
        this.commentAuthorName = commentAuthorName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
