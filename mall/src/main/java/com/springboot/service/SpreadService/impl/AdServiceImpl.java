package com.springboot.service.SpreadService.impl;

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
}
