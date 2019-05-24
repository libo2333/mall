package com.springboot.bean.mall.brand;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrandList {
    int total;
    List<Brand> items;

    public BrandList() {
    }

    public BrandList(int total, List<Brand> items) {
        this.total = total;
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Brand> getItems() {
        return items;
    }

    public void setItems(List<Brand> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "BrandList{" +
                "total=" + total +
                ", items=" + items +
                '}';
    }
}
