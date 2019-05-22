package com.cskaoyan.mall_springboot.bean.mall;

import java.util.List;

public class City {
    int id;
    String name;
    int type;
    int code;
    List<Region> children;

    public City(int id, String name, int type, int code, List<Region> children) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.code = code;
        this.children = children;
    }

    public City() {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Region> getChildren() {
        return children;
    }

    public void setChildren(List<Region> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", code=" + code +
                ", children=" + children +
                '}';
    }
}
