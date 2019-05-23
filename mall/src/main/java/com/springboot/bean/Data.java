package com.springboot.bean;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Data<T> {
    private List<T> items;
    private int total;

    public Data() {
    }

    public Data(List<T> items, int total) {
        this.items = items;
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
