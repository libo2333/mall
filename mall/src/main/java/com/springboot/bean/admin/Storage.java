package com.springboot.bean.admin;

import org.apache.ibatis.type.Alias;

import java.util.Date;

public class Storage {
    private String addTime; /*datetime*//*addTime: "2019-05-23 04:36:28"*/
    private boolean deleted;/*tinyint*//*deleted: false*/
    private int id;/*int*//*id: 53*/
    private String key;/*varchar*//*key: "v8zlsl2cg6hcsyc5nb0b.jpg"*/
    private String name;/*varchar*//*name: "-7Q5-d040K1zT1kShs-i1.jpg.medium.jpg"*/
    private int size;/*int*//*size: 73133*/
    private String type;/*varchar*//*type: "image/jpeg"*/
    private String updateTime;/*datetime*//*updateTime: "2019-05-23 04:36:28"*/
    private String url;/*varchar*//*url: "http://localhost:8080/wx/storage/fetch/v8zlsl2cg6hcsyc5nb0b.jpg"*/

    public Storage() {
    }

    public Storage(String addTime, boolean deleted, int id, String key, String name, int size, String type, String updateTime, String url) {
        this.addTime = addTime;
        this.deleted = deleted;
        this.id = id;
        this.key = key;
        this.name = name;
        this.size = size;
        this.type = type;
        this.updateTime = updateTime;
        this.url = url;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
