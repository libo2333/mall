package com.cskaoyan.mall_springboot.bean;

public class QueryStatus {
    int errono;
    Data data;
    String errmsg;

    public int getErrono() {
        return errono;
    }

    public void setErrono(int errono) {
        this.errono = errono;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
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
        return "QueryStatus{" +
                "errono=" + errono +
                ", data=" + data +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
