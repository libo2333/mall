package com.springboot.bean.mall.category;

public class CategoryL2 {
    int id;
    String name;
    String keywords;
    String desc;
    String iconUrl;
    String picUrl;
    String level;
    private Byte sortOrder;

    private String addTime;

    private String updateTime;

    private Boolean deleted;

    public CategoryL2() {
    }

    public CategoryL2(int id, String name, String keywords, String desc, String iconUrl, String picUrl, String level) {
        this.id = id;
        this.name = name;
        this.keywords = keywords;
        this.desc = desc;
        this.iconUrl = iconUrl;
        this.picUrl = picUrl;
        this.level = level;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CategoryL2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", keywords='" + keywords + '\'' +
                ", desc='" + desc + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", level='" + level + '\'' +
                ", sortOrder=" + sortOrder +
                ", addTime='" + addTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
