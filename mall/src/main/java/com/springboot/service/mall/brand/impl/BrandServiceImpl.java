package com.springboot.service.mall.brand.impl;

import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.brand.BrandList;
import com.springboot.bean.mall.brand.QueryBrand;
import com.springboot.mapper.mall.BrandMapper;
import com.springboot.service.mall.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandMapper brandMapper;
    @Autowired
    QueryBrand queryBrand;
    @Autowired
    BrandList brandList;

    @Override
    public QueryBrand selectQuery(int page,int limit,Integer id,String name) {
        List<Brand> brands = null;

        if(id==null && name==null){
        brands = brandMapper.selectBrandList();
        List<Brand> brands1 = brands.subList((page - 1) * limit, ((page) * limit) >= brands.size() ? brands.size() : ((page) * limit));
        brandList.setTotal(brands.size());
        brandList.setItems(brands1);
        queryBrand.setData(brandList);
        queryBrand.setErrmsg("成功");
        queryBrand.setErrno(0);
        //System.out.println(brands);
        return queryBrand;
        }
        if(id!=null && name != null){
            brands = brandMapper.selectBrandListByIdAndName(id,name);
        }
        if(id==null && name!=null){
            brands = brandMapper.selectBrandListByName(name);
        }
        if(id!=null && name==null){
            brands = brandMapper.selectBrandListById(id);
        }

        brandList.setTotal(brands.size());
        brandList.setItems(brands);
        queryBrand.setData(brandList);
        queryBrand.setErrmsg("成功");
        queryBrand.setErrno(0);
        return queryBrand;
    }

    @Override
    public int deleteBrandById(int id) {
        return brandMapper.deleteBrandById(id);
    }

    @Override
    public int updateBrand(Brand brand) {
        return brandMapper.updateBrand(brand);
    }

    @Override
    public int insertBrand(Brand brand) {
        return brandMapper.insertBrand(brand);
    }

    @Override
    public Brand returnBrand(Brand brand) {
        return brandMapper.returnBrand(brand);
    }
}
