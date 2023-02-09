package com.BlogBackEnd.model;

/**
 * @className BlogBean
 * @author Anke Zuo
 * @description basic info of a blog
 * @updateTime 2/9/23 02:06
 * @version 1.0
 */
public class BlogBean {
    private int id;
    private String title;
    private int authorId;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
