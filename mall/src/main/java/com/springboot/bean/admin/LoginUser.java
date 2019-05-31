package com.springboot.bean.admin;

public class LoginUser {
    String code;
    UserInfo userInfo;

    public LoginUser() {
    }

    public LoginUser(String code, UserInfo userInfo) {
        this.code = code;
        this.userInfo = userInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
