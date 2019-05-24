package com.springboot.controller.admin;

import com.springboot.bean.Data;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.ResponseV01;
import com.springboot.bean.admin.Role;
import com.springboot.bean.admin.RoleLabelValue;
import com.springboot.service.admin.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminRoleController {
    @Autowired
    RoleService roleService;
    @RequestMapping(value = "role/options", method = RequestMethod.OPTIONS)
    public void roleOptions() {

    }
    @ResponseBody
    @RequestMapping(value = "role/options", method = RequestMethod.GET)
    public ResponseV01 roleNameAndId() {
        List<RoleLabelValue> roleLabelValues = roleService.queryRoleIdAndName();
        return new ResponseV01<>(roleLabelValues, "成功", 0);
    }
    @ResponseBody
    @RequestMapping(value = "role/list", method = RequestMethod.GET)
    public ResponseVO roleList(@RequestParam("page") int page,
                               @RequestParam("limit") int limit,
                               @RequestParam("sort") String sort,
                               @RequestParam("order") String order) {
        List<Role> roles = roleService.queryAll(page,limit,sort,order);

        return new ResponseVO(new Data<>( roles,roles.size()), "成功", 0);
    }



}
