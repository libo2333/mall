package com.springboot.service.SpreadService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Coupon;

import java.util.List;

public interface CouponService {
    List<Coupon> queryCouponList(PageDetail pageDetail, String name, String type, String status);
}
