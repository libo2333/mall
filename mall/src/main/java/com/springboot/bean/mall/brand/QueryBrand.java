package com.springboot.bean.mall.brand;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class QueryBrand {
    int errno;
    BrandList data;
    String errmsg;

    public QueryBrand() {
    }

    public QueryBrand(int errno, BrandList data, String errmsg) {
        this.errno = errno;
        this.data = data;
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public BrandList getData() {
        return data;
    }

    public void setData(BrandList data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "QueryBrand{" +
                "errno=" + errno +
                ", data=" + data +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
