package com.springboot.service.mall.brand;

import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.brand.QueryBrand;

import java.util.List;

public interface BrandService {

    QueryBrand selectQuery(int page,int limit,Integer id, String name);

    int deleteBrandById(int id);

    int updateBrand(Brand transfer);

    int insertBrand(Brand brand);

    Brand returnBrand(Brand brand);
}
