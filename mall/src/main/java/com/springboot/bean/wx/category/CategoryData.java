package com.springboot.bean.wx.category;

import com.springboot.bean.mall.category.CategoryL2;

import java.util.List;

public class CategoryData {

    private List<CategoryL2> categoryList;

    private CategoryL2 currentCategory;

    private List<CategoryL2> currentSubCategory;

    public List<CategoryL2> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryL2> categoryList) {
        this.categoryList = categoryList;
    }

    public CategoryL2 getCurrentCategory() {
        return currentCategory;
    }

    public void setCurrentCategory(CategoryL2 currentCategory) {
        this.currentCategory = currentCategory;
    }

    public List<CategoryL2> getCurrentSubCategory() {
        return currentSubCategory;
    }

    public void setCurrentSubCategory(List<CategoryL2> currentSubCategory) {
        this.currentSubCategory = currentSubCategory;
    }

    @Override
    public String toString() {
        return "CategoryData{" +
                "categoryList=" + categoryList +
                ", currentCategory=" + currentCategory +
                ", currentSubCategory=" + currentSubCategory +
                '}';
    }
}
