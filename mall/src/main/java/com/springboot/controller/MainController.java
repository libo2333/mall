package com.springboot.controller;





import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {


    @RequestMapping(value = "admin/auth/login")
    public Map login(String username, String password){
        HashMap<String, Object> loginResult = new HashMap<>();
        loginResult.put("errmsg", "成功");
        loginResult.put("errno", 0);
        return loginResult;

    }


    @RequestMapping(value = "admin/auth/info")
    public Map loginInfo(){

        HashMap<String, Object> loginToken = new HashMap<>();
        HashMap<String, Object> data = new HashMap<>();
        data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        ArrayList<String> perms = new ArrayList<>();
        perms.add("*");
        ArrayList<String> roles = new ArrayList<>();
        roles.add("超级管理员");
        data.put("name", "admin123");
        data.put("perms", perms);
        data.put("roles", roles);
        loginToken.put("data", data);
        loginToken.put("errmsg", "成功");
        loginToken.put("errno", 0);
        return loginToken;


    }
}
