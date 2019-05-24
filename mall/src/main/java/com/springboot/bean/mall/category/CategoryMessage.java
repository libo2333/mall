package com.springboot.bean.mall.category;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryMessage {
    int errno;
    List<CategoryL1> data;
    String errmsg;

    public CategoryMessage() {
    }


}
