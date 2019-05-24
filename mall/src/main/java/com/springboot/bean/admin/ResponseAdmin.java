package com.springboot.bean.admin;

import org.springframework.stereotype.Component;

@Component
public class ResponseAdmin {
    private String avatar;
    private int id;
    private Integer roleIds[];/*varchar*//*  roleIds: [2, 3, 10, 1]*/
    private String username;

    public ResponseAdmin() {
    }

    public ResponseAdmin(String avatar, int id, Integer[] roleIds, String username) {
        this.avatar = avatar;
        this.id = id;
        this.roleIds = roleIds;
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Integer[] roleIds) {
        this.roleIds = roleIds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
