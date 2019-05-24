package com.springboot.bean.mall.brand;

public class BrandMessage {
    int errno;
    Brand data;
    String errmsg;

    public BrandMessage() {
    }

    public BrandMessage(int errno, Brand data, String errmsg) {
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

    public Brand getData() {
        return data;
    }

    public void setData(Brand data) {
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
        return "BrandMessage{" +
                "errno=" + errno +
                ", data=" + data +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
