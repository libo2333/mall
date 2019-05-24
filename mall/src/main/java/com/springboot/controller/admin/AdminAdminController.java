package com.springboot.controller.admin;

import com.springboot.bean.Data;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Admin;
import com.springboot.bean.admin.ResponseAdmin;
import com.springboot.bean.admin.ResponseV01;
import com.springboot.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class AdminAdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping(value = "admin/list",method = RequestMethod.OPTIONS)
    public void adminOption(){

    }
    /*/admin/admin/list?page=1&limit=20&sort=add_time&order=desc*/
    @ResponseBody
    @RequestMapping(value = "admin/list",method = RequestMethod.GET)
    public ResponseVO adminList(@RequestParam("page") int page,
                                @RequestParam("limit") int limit,
                                @RequestParam("sort") String sort,
                                @RequestParam("order") String order){
        List<ResponseAdmin> responseAdmins =adminService.queryAllAdmin(page, limit, sort, order);
        return new ResponseVO(new Data<>(responseAdmins,responseAdmins.size()), "成功", 0);
    }
    @ResponseBody
    @RequestMapping(value = "admin/create",method = RequestMethod.POST)
    public ResponseVO adminCreate(@RequestBody ResponseAdmin responseAdmin){

        System.out.println(responseAdmin);
        return null;
    }


}
