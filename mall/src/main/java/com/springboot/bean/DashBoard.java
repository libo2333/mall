package com.springboot.bean;

public class DashBoard {
    private int goodsTotal;
    private int orderTotal;
    private int productTotal;
    private int userTotal;

    public int getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(int goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getProductTotal() {
        return productTotal;
    }

    public void setProductTotal(int productTotal) {
        this.productTotal = productTotal;
    }

    public int getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(int userTotal) {
        this.userTotal = userTotal;
    }

    @Override
    public String toString() {
        return "DashBoard{" +
                "goodsTotal=" + goodsTotal +
                ", orderTotal=" + orderTotal +
                ", productTotal=" + productTotal +
                ", userTotal=" + userTotal +
                '}';
    }
}
