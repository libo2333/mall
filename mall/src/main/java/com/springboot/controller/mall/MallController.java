package com.springboot.controller.mall;

import com.springboot.bean.mall.Region;
import com.springboot.service.mall.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MallController {

    @Autowired
    RegionService regionService;
    @Autowired
    Region region;

    @RequestMapping("/region/list")
    @ResponseBody
    public Region region1(){

       Region region = regionService.getRegion();
        /*List<Province> provinceList = regionService.selectProvinces();*/
        return  region;
    }



}
