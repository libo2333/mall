package com.springboot.controller.UserController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.User;
import com.springboot.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("admin/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO user(PageDetail pageDetail,String username,String mobile){
        pageDetail.setOffset();
        List<User> userList = userService.queryUserList(pageDetail,username,mobile);
        if (userList.isEmpty()&&userList==null){
            return new ResponseVO(null, "fail", 404);
        }else{
            int total = userService.queryUserCount(username,mobile);
            data.setTotal(total);
            data.setItems(userList);
            return new ResponseVO(data, "成功", 0);
        }
    }

}
