package com.springboot.service.wx.home.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.bean.wx.category.Goods;
import com.springboot.bean.wx.home.FloorGoodsData;
import com.springboot.mapper.SpreadMapper.AdMapper;
import com.springboot.mapper.SpreadMapper.CouponMapper;
import com.springboot.mapper.mall.BrandMapper;
import com.springboot.mapper.mall.CategoryMapper;
import com.springboot.mapper.wx.category.GoodsMapper;
import com.springboot.service.wx.home.WXHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
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
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    FloorGoodsData floorGoodsData;

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

    @Override
    public List<FloorGoodsData> queryFloorGoodsList() {
        List<CategoryL2> categoryList = categoryMapper.selectCategoryList();
        List<FloorGoodsData> floorGoodsList = new ArrayList<FloorGoodsData>();
        for (CategoryL2 category:
        categoryList){
            int id = category.getId();
            String name = category.getName();
            List<CategoryL2> subCategoryList = categoryMapper.selectSubCategory(id);
            List<Goods> goodsList = new ArrayList<Goods>();
            for (CategoryL2 categoryL2:
                 subCategoryList) {
                int id2 = categoryL2.getId();
                List<Goods> goodsList1  = goodsMapper.selectGoodsList(id2);
                goodsList.addAll(goodsList1);
        }
            floorGoodsData.setGoodsList(goodsList);
            floorGoodsData.setId(id);
            floorGoodsData.setName(name);
            floorGoodsList.add(floorGoodsData);
        }
        return floorGoodsList;
    }
}
