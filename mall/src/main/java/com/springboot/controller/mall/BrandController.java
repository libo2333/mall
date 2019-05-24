package com.springboot.controller.mall;


import com.springboot.bean.mall.brand.*;
import com.springboot.service.mall.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@Controller
public class BrandController {

    @Autowired
    QueryBrand queryBrand;
    @Autowired
    BrandService brandService;

    @RequestMapping("brand/list")
    @ResponseBody
    public QueryBrand brand1(int page,int limit,Integer id,String name){
        QueryBrand queryBrand = brandService.selectQuery(page,limit,id,name);
        //System.out.println(id);
        return queryBrand;
    }

    @RequestMapping("brand/delete")
    @ResponseBody
    public Message brand2(HttpServletRequest req){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = req.getReader();) {
            char[]buff = new char[1024];
            int len;
            while((len = reader.read(buff)) != -1) {
                sb.append(buff,0, len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        String s = sb.toString();
        int i = s.indexOf(":");
        int i1 = s.indexOf(",");
        String substring = s.substring(i+1, i1);
        int i2 = Integer.parseInt(substring);
        int message = brandService.deleteBrandById(i2);
        return message==1?new Message(0,"成功"):new Message(0,"失败");
    }

    @RequestMapping("brand/update")
    @ResponseBody
    public BrandMessage brand3(HttpServletRequest req){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = req.getReader();) {
            char[]buff = new char[1024];
            int len;
            while((len = reader.read(buff)) != -1) {
                sb.append(buff,0, len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        String s = sb.toString();
        Brand transfer = BrandUtil.transfer(s);
        int flag = brandService.updateBrand(transfer);
        return flag==1?new BrandMessage(0,transfer,"成功"):new BrandMessage(0,transfer,"失败");
    }

    @RequestMapping("brand/create")
    @ResponseBody
    public BrandMessage brand4(HttpServletRequest req){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = req.getReader();) {
            char[]buff = new char[1024];
            int len;
            while((len = reader.read(buff)) != -1) {
                sb.append(buff,0, len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        String s = sb.toString();
        Brand brand = BrandUtil.transfer2(s);
        int flag = brandService.insertBrand(brand);
        Brand newBrand = brandService.returnBrand(brand);
        return new BrandMessage(0,newBrand,"成功");
    }
}
