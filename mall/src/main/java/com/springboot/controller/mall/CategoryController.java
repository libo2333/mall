package com.springboot.controller.mall;

import com.springboot.bean.mall.category.CategoryMessage;
import com.springboot.service.mall.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    CategoryMessage categoryMessage;

    @RequestMapping("category/list")
    @ResponseBody
    public CategoryMessage category1(){

        categoryMessage = categoryService.categoryList();
        return categoryMessage;
    }

}
