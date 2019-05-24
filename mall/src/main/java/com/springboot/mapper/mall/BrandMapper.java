package com.springboot.mapper.mall;

import com.springboot.bean.mall.brand.Brand;

import java.util.List;

public interface BrandMapper {

    List<Brand> selectBrandList();

    List<Brand> selectBrandListByIdAndName(Integer id, String name);

    List<Brand> selectBrandListByName(String name);

    List<Brand> selectBrandListById(Integer id);

    int deleteBrandById(int id);

    int updateBrand(Brand brand);

    int insertBrand(Brand brand);

    Brand returnBrand(Brand brand);
}
