package com.springboot.bean.mall.brand;

public class Message {
    int errno;
    String errmsg;

    public Message() {
    }

    public Message(int errno, String errmsg) {
        this.errno = errno;
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "errno=" + errno +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
