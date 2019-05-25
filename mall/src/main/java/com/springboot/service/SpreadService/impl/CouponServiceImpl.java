package com.springboot.service.SpreadService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.mapper.SpreadMapper.CouponMapper;
import com.springboot.service.SpreadService.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    CouponMapper couponMapper;

    @Override
    public List<Coupon> queryCouponList(PageDetail pageDetail, String name, String type, String status) {
        List<Coupon> couponList = couponMapper.selectCouponList(pageDetail,name,type,status);
        return couponList;
    }
}
