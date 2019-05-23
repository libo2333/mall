package com.springboot.service.UserService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.FootPrint;
import com.springboot.mapper.UserMapper.FootPrintMapper;
import com.springboot.service.UserService.FootPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootPrintServiceImpl implements FootPrintService {

    @Autowired
    FootPrintMapper footPrintMapper;

    @Override
    public List<FootPrint> queryFootPrintList(PageDetail pageDetail, String userId, String goodsId) {
        List<FootPrint> footPrintList = footPrintMapper.selectFootPrintList(pageDetail,userId,goodsId);
        return footPrintList;
    }
}
