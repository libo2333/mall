package com.springboot.service.mall.impl;


import com.springboot.bean.mall.Region;
import com.springboot.bean.mall.Town;
import com.springboot.mapper.mall.RegionMapper;
import com.springboot.service.mall.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionMapper regionMapper;


    @Override
    public Region getRegion() {
        List<Town> provinces = regionMapper.selectProvinces();
        System.out.println(provinces);
        return null;
    }
}
