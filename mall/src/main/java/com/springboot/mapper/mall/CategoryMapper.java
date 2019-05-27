package com.springboot.mapper.mall;

import com.springboot.bean.mall.category.CategoryL2;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CategoryMapper {
    List<CategoryL2> selectCategoryList(int limit,int offset);

    CategoryL2 selectCurrentCategoryById(int id);

    List<CategoryL2> selectSubCategory(int id);
}
