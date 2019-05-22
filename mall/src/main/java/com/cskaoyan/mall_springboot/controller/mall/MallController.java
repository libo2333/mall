package com.cskaoyan.mall_springboot.controller.mall;


import com.cskaoyan.mall_springboot.bean.mall.Province;
import com.cskaoyan.mall_springboot.bean.mall.Region;
import com.cskaoyan.mall_springboot.service.mall.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin")
public class MallController {

    @Autowired
    RegionService regionService;
    @Autowired
    Region region;

    @RequestMapping("/region/list")
    public Region region1(){

        regionService.getRegion();
        /*List<Province> provinceList = regionService.selectProvinces();*/

        return  null;
    }



}
