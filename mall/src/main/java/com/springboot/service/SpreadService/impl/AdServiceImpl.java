package com.springboot.service.SpreadService.impl;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.mapper.SpreadMapper.AdMapper;
import com.springboot.service.SpreadService.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {

    @Autowired
    AdMapper adMapper;

    @Override
    public List<Ad> queryAdList(PageDetail pageDetail, String name, String content) {
        List<Ad> adList = adMapper.selectAdList(pageDetail,name,content);
        return adList;
    }

    @Override
    public int insertAd(Ad ad) {
        int ret = adMapper.insertSelective(ad);
        return ret;
    }

    @Override
    public int updateAd(Ad ad) {
        int ret = adMapper.updateByPrimaryKey(ad);
        return ret;
    }

    @Override
    public Ad queryAdByPrimaryKey(Integer id) {
        Ad ad = adMapper.selectByPrimaryKey(id);
        return ad;
    }

    @Override
    public int deleteAd(Integer id) {
        int ret = adMapper.deleteByPrimaryKey(id);
        return ret;
    }
}
