package com.springboot.bean.admin;

import org.apache.ibatis.type.Alias;

import java.util.Date;

public class Log {
    /*按照字母顺序,sql--bean--json*/
    private String action;/*varchar*//*action: "登录"*/
    private String addTime;/*datetime*//*addTime: "2019-05-23 04:21:53"*/
    private String admin;/*varchar*//*admin: "admin123"*/
    private String comment;/*varchar*//*comment: ""*/
    private boolean deleted;/*tinyint*//*deleted: false*/
    private int id;/*int*//*id: 695*/
    private String ip;/*varchar*//*ip: "192.168.5.104"*/
    private String result;/*varchar*//*result: ""*/
    private boolean status;/*tinyint*//*status: true*/
    private int type;/*int*//*type: 1*/
    private String updateTime;/*datetime*//*updateTime: "2019-05-23 04:21:53"*/

    public Log() {
    }

    public Log(String action, String addTime, String admin, String comment, boolean deleted, int id, String ip, String result, boolean status, int type, String updateTime) {
        this.action = action;
        this.addTime = addTime;
        this.admin = admin;
        this.comment = comment;
        this.deleted = deleted;
        this.id = id;
        this.ip = ip;
        this.result = result;
        this.status = status;
        this.type = type;
        this.updateTime = updateTime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
