package com.springboot.bean.mall.category;

import java.util.List;

public class CategoryL1 {
    int id;
    String name;
    String keywords;
    String desc;
    String iconUrl;
    String picUrl;
    String level;
    List<CategoryL2> children;

    public CategoryL1() {
    }

    public CategoryL1(int id, String name, String keywords, String desc, String iconUrl, String picUrl, String level, List<CategoryL2> children) {
        this.id = id;
        this.name = name;
        this.keywords = keywords;
        this.desc = desc;
        this.iconUrl = iconUrl;
        this.picUrl = picUrl;
        this.level = level;
        this.children = children;
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

    public List<CategoryL2> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryL2> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "CategoryL1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", keywords='" + keywords + '\'' +
                ", desc='" + desc + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", level='" + level + '\'' +
                ", children=" + children +
                '}';
    }
}
