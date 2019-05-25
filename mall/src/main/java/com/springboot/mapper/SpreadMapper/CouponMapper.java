package com.springboot.mapper.SpreadMapper;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Coupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectCouponList(@Param("pageDetail")PageDetail pageDetail,@Param("name")String name,@Param("type")String type,@Param("status")String status);

    Coupon selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}