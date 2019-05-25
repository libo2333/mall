package com.springboot.bean;


public class PageDetail<T> {
    private int page;
    private int limit;
    private int offset;
    private String sort;
    private String order;
    private T requestBean;

    public PageDetail() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset() {
        offset = limit * (page - 1);
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public T getRequestBean() {
        return requestBean;
    }

    public void setRequestBean(T requestBean) {
        this.requestBean = requestBean;
    }
}
