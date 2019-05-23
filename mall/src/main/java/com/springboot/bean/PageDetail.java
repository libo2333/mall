package com.springboot.bean;


public class PageDetail {
    private int page;
    private int limit;
    private int offset;
    private String sort;
    private String order;

    public PageDetail() {
    }

    public PageDetail(int page, int limit, int offset, String sort, String order) {
        this.page = page;
        this.limit = limit;
        this.offset = offset;
        this.sort = sort;
        this.order = order;
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
}
