package com.springboot.controller.admin;

import com.springboot.Util.DateUtils;
import com.springboot.bean.Data;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Admin;
import com.springboot.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RequestMapping("admin")
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @ResponseBody
    @RequestMapping(value = "admin/list",method = RequestMethod.GET)
    public ResponseVO adminList(@RequestParam("page") int page,
                                @RequestParam("limit") int limit,
                                @RequestParam("sort") String sort,
                                @RequestParam("order") String order,
                                HttpServletRequest request){
        String username = request.getParameter("username");
        List<HashMap<String, Object>> Admins;
        if(null==username) {
            Admins= adminService.queryAllAdmin(page, limit, sort, order);
        }else {
            Admins=adminService.queryAllAdminByName(page, limit, sort, order,username);
        }
        return new ResponseVO<>(new Data<>(Admins,Admins.size()), "成功", 0);
    }

    @ResponseBody
    @RequestMapping(value = "admin/create",method = RequestMethod.POST)
    public ResponseVO insertAdmin(@RequestBody Admin admin, HttpServletRequest request) throws ParseException {
        admin.setLastLogInIp(request.getRemoteHost());
        String date = DateUtils.dateOfNow();
        admin.setLastLogInTime(date);
        admin.setUpdateTime(date);
        admin.setAddTime(date);
        admin.setDeleted(0);
        int i = adminService.insertAdmin(admin);
        if(i!=0){
            admin.setId(i);
            return  new ResponseVO<>(admin,"成功",0);
        }
        return null;
    }
    @RequestMapping(value = "admin/update")
    @ResponseBody
    public ResponseVO updateAdmin(@RequestBody Admin admin,
                                  HttpServletRequest request) throws ParseException {
        String date = DateUtils.dateOfNow();
        admin.setUpdateTime(date);
        admin.setLastLogInIp(request.getRemoteHost());
        admin.setLastLogInTime(date);
        int i = adminService.updateAdmin(admin);
        if(i!=0) {
            return new ResponseVO<>(admin, "成功", 0);
        }else {
            return new ResponseVO<>(null,"失败",0);
        }
    }
    @RequestMapping("admin/delete")
    @ResponseBody
    public ResponseVO deleteAdmin(@RequestBody Admin admin){
        if(adminService.deleteAdmin(admin)!=0){
            return new ResponseVO<>(null,"成功",0);
        }else {
            return new ResponseVO<>(null,"失败",1);
        }
    }


}
