package com.cskaoyan.mall_springboot.service.UserService;

import com.cskaoyan.mall_springboot.bean.QueryStatus;
import com.cskaoyan.mall_springboot.bean.UserBean.User;


public interface UserService {
    boolean login(User user);

    QueryStatus queryUserList();
}
