package com.springboot.bean;

public class PictureData {
    private String addTime;
    private int id;
    private String key;
    private String name;
    private long size;
    private String type;
    private String updateTime;
    private String url;
    private Boolean deleted;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
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

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
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

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "PictureData{" +
                "addTime='" + addTime + '\'' +
                ", id=" + id +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", url='" + url + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
