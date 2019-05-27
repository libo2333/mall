package com.springboot.controller.wx.home;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.bean.mall.brand.Brand;
import com.springboot.bean.mall.category.CategoryL2;
import com.springboot.bean.wx.category.Goods;
import com.springboot.bean.wx.home.HomeData;
import com.springboot.service.wx.home.WXHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("wx/home")
public class WXHomeController {

    @Autowired
    WXHomeService wxHomeService;
    @Autowired
    HomeData data;

    @RequestMapping("index")
    @ResponseBody
    public ResponseVO home(){
        List<Ad> banner = wxHomeService.queryAdList();
        List<Brand> brandList = wxHomeService.queryBrandList();
        List<CategoryL2> channel = wxHomeService.queryCategoryList();
        List<Coupon> couponList = wxHomeService.queryCouponList();
        /*List<Goods> floorGoodsList = wxHomeService.queryFloorGoodsList();*/
        data.setBanner(banner);
        data.setBrandList(brandList);
        data.setCategoryList(channel);
        data.setCouponList(couponList);
        return new ResponseVO(data,"ok",0);
    }
}
