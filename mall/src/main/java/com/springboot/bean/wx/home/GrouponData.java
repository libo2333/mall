package com.springboot.bean.wx.home;

import com.springboot.bean.wx.category.Goods;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class GrouponData {
    private List<Goods> goodsList;
    private int groupon_member;
    private BigDecimal groupon_price;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public int getGroupon_member() {
        return groupon_member;
    }

    public void setGroupon_member(int groupon_member) {
        this.groupon_member = groupon_member;
    }

    public BigDecimal getGroupon_price() {
        return groupon_price;
    }

    public void setGroupon_price(BigDecimal groupon_price) {
        this.groupon_price = groupon_price;
    }

    @Override
    public String toString() {
        return "GrouponData{" +
                "goodsList=" + goodsList +
                ", groupon_member=" + groupon_member +
                ", groupon_price=" + groupon_price +
                '}';
    }
}
