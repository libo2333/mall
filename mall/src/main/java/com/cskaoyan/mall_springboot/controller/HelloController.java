package com.cskaoyan.mall_springboot.controller;

import com.cskaoyan.mall_springboot.property.DataSourceProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;


@Controller
public class HelloController {

    @Autowired
    DataSource dataSource;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("/admin/user/list")
    @ResponseBody
    public String admin(){
        return "admin";
    }
}