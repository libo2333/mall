package com.springboot.bean.wx.home;

import com.springboot.bean.SpreadBean.Ad;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.bean.SpreadBean.Groupon;
import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.bean.wx.category.Goods;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HomeData {
    private List<Ad> banner;
    private List<Brand> brandList;
    private List<CategoryL2> categoryList;
    private List<Coupon> couponList;
    private List<Goods> floorGoodsList;
    private List<Groupon> grouponList;
    private List<Goods> hotGoodsList;
    private List<Goods> newGoodsList;
    private List<Topic> topicList;

    public List<Ad> getBanner() {
        return banner;
    }

    public void setBanner(List<Ad> banner) {
        this.banner = banner;
    }

    public List<Brand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Brand> brandList) {
        this.brandList = brandList;
    }

    public List<CategoryL2> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryL2> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Coupon> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<Coupon> couponList) {
        this.couponList = couponList;
    }

    public List<Goods> getFloorGoodsList() {
        return floorGoodsList;
    }

    public void setFloorGoodsList(List<Goods> floorGoodsList) {
        this.floorGoodsList = floorGoodsList;
    }

    public List<Groupon> getGrouponList() {
        return grouponList;
    }

    public void setGrouponList(List<Groupon> grouponList) {
        this.grouponList = grouponList;
    }

    public List<Goods> getHotGoodsList() {
        return hotGoodsList;
    }

    public void setHotGoodsList(List<Goods> hotGoodsList) {
        this.hotGoodsList = hotGoodsList;
    }

    public List<Goods> getNewGoodsList() {
        return newGoodsList;
    }

    public void setNewGoodsList(List<Goods> newGoodsList) {
        this.newGoodsList = newGoodsList;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    @Override
    public String toString() {
        return "HomeData{" +
                "banner=" + banner +
                ", brandList=" + brandList +
                ", categoryList=" + categoryList +
                ", couponList=" + couponList +
                ", floorGoodsList=" + floorGoodsList +
                ", grouponList=" + grouponList +
                ", hotGoodsList=" + hotGoodsList +
                ", newGoodsList=" + newGoodsList +
                ", topicList=" + topicList +
                '}';
    }
}
