package com.springboot.service.UserService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.User;
import com.springboot.mapper.UserMapper.UserMapper;
import com.springboot.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryUserList(PageDetail pageDetail,String username,String mobiile) {

        List<User> userList = userMapper.queryUserList(pageDetail,username,mobiile);
        System.out.println(userList);
        return userList;
    }
}
