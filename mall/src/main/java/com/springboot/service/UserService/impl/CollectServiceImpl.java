package com.springboot.service.UserService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Collect;
import com.springboot.mapper.UserMapper.CollectMapper;
import com.springboot.service.UserService.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    CollectMapper collectMapper;

    @Override
    public List<Collect> queryCollectList(PageDetail pageDetail, String userId, String valueId) {
        List<Collect> collectList = collectMapper.selectCollectList(pageDetail,userId,valueId);
        return collectList;
    }

    @Override
    public int queryCollectCount(String userId, String valueId) {
        int ret = collectMapper.selectCollectCount(userId,valueId);
        return ret;
    }
}
