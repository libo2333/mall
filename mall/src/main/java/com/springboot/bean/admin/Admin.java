package com.springboot.bean.admin;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/*@Alias("admin")*/
public class Admin {
    private String avatar;/*varchar*//*avatar: "'"*/
    private int id;/*int*/
    private String roleIds[];/*varchar*//*  roleIds: [2, 3, 10, 1]*/
    private String username;
    private String password;
    /*role表*/
    private int value;/*int*//*  label: "超级管理员"*/
    private String label;/*varchar*/    /*value: 1*/
    private String addTime;
    private String updateTime;

    private String lastLogInIp;
    private String lastLogInTime;

    public Admin() {
    }

    public Admin(String avatar, int id, String[] roleIds, String username, String password, int value, String label, String addTime, String updateTime, String lastLogInIp, String lastLogInTime) {
        this.avatar = avatar;
        this.id = id;
        this.roleIds = roleIds;
        this.username = username;
        this.password = password;
        this.value = value;
        this.label = label;
        this.addTime = addTime;
        this.updateTime = updateTime;
        this.lastLogInIp = lastLogInIp;
        this.lastLogInTime = lastLogInTime;
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

    public String[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String[] roleIds) {
        this.roleIds = roleIds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getLastLogInIp() {
        return lastLogInIp;
    }

    public void setLastLogInIp(String lastLogInIp) {
        this.lastLogInIp = lastLogInIp;
    }

    public String getLastLogInTime() {
        return lastLogInTime;
    }

    public void setLastLogInTime(String lastLogInTime) {
        this.lastLogInTime = lastLogInTime;
    }
}
