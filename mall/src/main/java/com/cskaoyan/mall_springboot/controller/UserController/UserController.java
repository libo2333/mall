package com.cskaoyan.mall_springboot.controller.UserController;

import com.cskaoyan.mall_springboot.bean.QueryStatus;
import com.cskaoyan.mall_springboot.bean.UserBean.User;
import com.cskaoyan.mall_springboot.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(User user, Model model){
        boolean login = userService.login(user);
        if(login){
            model.addAttribute("user",user);
            return "hello";
        }
        return "index.html";
    }

   /* @RequestMapping("list")
    @ResponseBody
    public QueryStatus user(){
        new D
        queryStatus = userService.queryUserList();
        return queryStatus;
    }*/

}
