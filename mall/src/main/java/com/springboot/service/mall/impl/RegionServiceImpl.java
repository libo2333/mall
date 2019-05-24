package com.springboot.service.mall.impl;


import com.springboot.bean.mall.City;
import com.springboot.bean.mall.Province;
import com.springboot.bean.mall.Region;
import com.springboot.bean.mall.Town;
import com.springboot.mapper.mall.RegionMapper;
import com.springboot.service.mall.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionMapper regionMapper;
    @Autowired
    Region region;


    @Override
    public Region getRegion() {
        //获得所有省份
        List<Province> provinces = regionMapper.selectProvinces();
        for (int i = 0; i < provinces.size(); i++) {
            //获得该省份的所有城市
            List<City> cities = regionMapper.selectCityByProvinceId(provinces.get(i).getCode());
            for (int j = 0; j < cities.size(); j++) {
                //获得该城市的所有县区
                List<Town> towns = regionMapper.selectTownByCityId(cities.get(j).getCode());
                cities.get(j).setChildren(towns);
            }
            provinces.get(i).setChildren(cities);
        }
        System.out.println(provinces);

        region.setErrno(0);
        region.setErrmsg("成功");
        region.setData(provinces);
        return region;
    }
}
