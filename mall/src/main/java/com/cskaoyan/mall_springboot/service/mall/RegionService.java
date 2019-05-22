package com.cskaoyan.mall_springboot.service.mall;

import com.cskaoyan.mall_springboot.bean.mall.Province;

import java.util.List;

public interface RegionService {
    List<Province> selectProvinces();

    void getRegion();

}
