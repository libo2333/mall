package com.springboot.service.wx.category;

import com.springboot.bean.mall.category.CategoryL2;

import java.util.List;

public interface WXCategoryService {
    List<CategoryL2> queryCategoryList();

    CategoryL2 queryCategoryById(int i);
}
