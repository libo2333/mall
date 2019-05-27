package com.springboot.service.wx.home.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.mapper.SpreadMapper.AdMapper;
import com.springboot.mapper.SpreadMapper.CouponMapper;
import com.springboot.mapper.mall.BrandMapper;
import com.springboot.mapper.mall.CategoryMapper;
import com.springboot.service.wx.home.WXHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WXHomeServiceImpl implements WXHomeService {

    @Autowired
    AdMapper adMapper;
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    CouponMapper couponMapper;

    @Override
    public List<Ad> queryAdList() {
        List<Ad> banner = adMapper.selectWXAdList();
        return banner;
    }

    @Override
    public List<Brand> queryBrandList() {
        List<Brand> brandList = brandMapper.selectBrandList();
        return brandList;
    }

    @Override
    public List<CategoryL2> queryCategoryList() {
        List<CategoryL2> channel = categoryMapper.selectCategoryList();
        return channel;
    }

    @Override
    public List<Coupon> queryCouponList() {
        List<Coupon> couponList = couponMapper.selectWXCouponList();
        return couponList;
    }
}
