package com.springboot.controller.wx.category;

import com.springboot.bean.ResponseVO;
import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.bean.wx.category.CategoryData;
import com.springboot.service.wx.category.WXCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("wx/catalog")
public class WXCategoryControlller {

    @Autowired
    WXCategoryService wxCategoryService;
    @Autowired
    CategoryData data;

    @RequestMapping("index")
    @ResponseBody
    public ResponseVO category(){
        List<CategoryL2> categoryList = wxCategoryService.queryCategoryList();
        int i = wxCategoryService.queryCategoryId();
        CategoryL2 currentCategory = wxCategoryService.queryCategoryById(i);
        List<CategoryL2> currentSubCategory = wxCategoryService.querySubCatogoryList(i);
        data.setCategoryList(categoryList);
        data.setCurrentCategory(currentCategory);
        data.setCurrentSubCategory(currentSubCategory);
        return new ResponseVO(data,"ok",0);
    }

    @RequestMapping("current")
    @ResponseBody
    public ResponseVO current(int id){
        CategoryL2 currentCategory = wxCategoryService.queryCategoryById(id);
        List<CategoryL2> currentSubCategory = wxCategoryService.querySubCatogoryList(id);
        data.setCurrentCategory(currentCategory);
        data.setCurrentSubCategory(currentSubCategory);
        return new ResponseVO(data,"ok",0);
    }
}
