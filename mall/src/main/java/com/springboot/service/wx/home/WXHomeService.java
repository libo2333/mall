package com.springboot.service.wx.home;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.bean.wx.home.FloorGoodsData;

import java.util.List;

public interface WXHomeService {
    List<Ad> queryAdList();

    List<Brand> queryBrandList();

    List<CategoryL2> queryCategoryList();

    List<Coupon> queryCouponList();

    List<FloorGoodsData> queryFloorGoodsList();
}
