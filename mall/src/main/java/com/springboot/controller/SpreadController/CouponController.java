package com.springboot.controller.SpreadController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.SpreadBean.Coupon;
import com.springboot.service.SpreadService.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin/coupon")
public class CouponController {

    @Autowired
    CouponService couponService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO coupon(PageDetail pageDetail,String name,String type,String status){
        pageDetail.setOffset();
        List<Coupon> couponList = couponService.queryCouponList(pageDetail,name,type,status);
        if (couponList.isEmpty()&&couponList==null){
            data.setTotal(couponList.size());
            data.setItems(couponList);
            return new ResponseVO(data,"ok",0);
        }else{
            return new ResponseVO(null,"fail",404);
        }
    }
}
