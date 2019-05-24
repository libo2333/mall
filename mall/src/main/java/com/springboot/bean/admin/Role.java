package com.springboot.bean.admin;

import org.apache.ibatis.type.Alias;

import java.util.Date;

public class Role {
    private int id;/*int*//* id: 10*/
    private String name;/*varchar*//*name: "销售管理员"*/
    private String desc;/*varchar*//*desc: "只有销售的权限"*/
    private int enabled;/*tinyint*//*enabled: true*/
    private String addTime;/*datetime*//* addTime: "2019-05-22 09:03:05"*/
    private String updateTime;/*datetime*//* updateTime: "2019-05-22 11:28:57"*/
    private int deleted;/*tinyint*//*deleted: false*/

    public Role() {
    }

    public Role(int id, String name, String desc, int enabled, String addTime, String updateTime, int deleted) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.enabled = enabled;
        this.addTime = addTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
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

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}
