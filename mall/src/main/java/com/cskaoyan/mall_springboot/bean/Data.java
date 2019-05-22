package com.cskaoyan.mall_springboot.bean;

import java.util.Arrays;

public class Data {
    int total;
    String[] items;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Data{" +
                "total=" + total +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
