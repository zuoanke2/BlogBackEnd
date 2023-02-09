package com.BlogBackEnd.model;

/**
 * @className UserBean
 * @author Anke Zuo
 * @description info of an user
 * @updateTime 2/9/23 02:08
 * @version 1.0
 */
public class UserBean {
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
