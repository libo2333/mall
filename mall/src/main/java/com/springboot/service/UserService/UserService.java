package com.springboot.service.UserService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.User;


import java.util.List;

public interface UserService {

    List<User> queryUserList(PageDetail pageDetail,String username,String mobile);
}
