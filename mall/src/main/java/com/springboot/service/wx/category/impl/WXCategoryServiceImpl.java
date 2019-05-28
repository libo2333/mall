package com.springboot.service.wx.category.impl;

import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.mapper.mall.CategoryMapper;
import com.springboot.mapper.wx.category.GoodsMapper;
import com.springboot.mapper.wx.category.WXCategoryMapper;
import com.springboot.service.wx.category.WXCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WXCategoryServiceImpl implements WXCategoryService {

    @Autowired
    WXCategoryMapper wxCategoryMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<CategoryL2> queryCategoryList() {
        List<CategoryL2> categoryList = categoryMapper.selectCategoryList();
        return categoryList;
    }

    @Override
    public CategoryL2 queryCategoryById(int i) {
        CategoryL2 currentCategory = categoryMapper.selectCurrentCategoryById(i);
        return currentCategory;
    }

    @Override
    public List<CategoryL2> querySubCatogoryList(int i) {
        List<CategoryL2> currentSubCategory = categoryMapper.selectSubCategory(i);
        return currentSubCategory;
    }

    @Override
    public int queryCategoryId() {
        int i = categoryMapper.selectFirstCategoryId();
        return i;
    }
}
