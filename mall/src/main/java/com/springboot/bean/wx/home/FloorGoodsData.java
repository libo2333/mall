package com.springboot.bean.wx.home;

import com.springboot.bean.wx.category.Goods;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FloorGoodsData {

    private List<Goods> goodsList;
    private int id;
    private String name;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
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

    @Override
    public String toString() {
        return "FloorGoodsData{" +
                "goodsList=" + goodsList +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
