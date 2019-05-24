package com.springboot.mapper.mall;

import com.springboot.bean.mall.City;
import com.springboot.bean.mall.Province;
import com.springboot.bean.mall.Town;

import java.util.List;


public interface RegionMapper {


    List<Province> selectProvinces();


    List<City> selectCityByProvinceId(int provinceId);

    List<Town> selectTownByCityId(int cityId);
}
