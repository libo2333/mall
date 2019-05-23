package com.springboot.bean;

import java.util.List;


public class Result<T> {
    private List<T> items;
    private int total;

    public Result() {
    }

    public Result(List<T> items, int total) {
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
