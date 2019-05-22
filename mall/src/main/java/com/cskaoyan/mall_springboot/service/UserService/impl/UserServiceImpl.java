package com.cskaoyan.mall_springboot.service.UserService.impl;

import com.cskaoyan.mall_springboot.bean.QueryStatus;
import com.cskaoyan.mall_springboot.bean.UserBean.User;
import com.cskaoyan.mall_springboot.mapper.UserMapper.UserMapper;
import com.cskaoyan.mall_springboot.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public QueryStatus queryUserList() {

        /*userMapper.queryUserList*/
        return null;
    }
}
