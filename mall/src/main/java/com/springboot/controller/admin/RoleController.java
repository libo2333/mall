package com.springboot.controller.admin;

import com.springboot.Util.DateUtils;
import com.springboot.bean.Data;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Role;

import com.springboot.service.admin.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("admin")
@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @ResponseBody
    @RequestMapping(value = "role/options", method = RequestMethod.GET)
    public ResponseVO roleNameAndId() {
        List<HashMap<String, Object>> Roles = roleService.queryRoleIdAndName();
        return new ResponseVO<>(Roles, "成功", 0);
    }

    @ResponseBody
    @RequestMapping(value = "role/list", method = RequestMethod.GET)
    public ResponseVO roleList(@RequestParam("page") int page,
                               @RequestParam("limit") int limit,
                               @RequestParam("sort") String sort,
                               @RequestParam("order") String order,
                               HttpServletRequest request) {
        String name = request.getParameter("name");
        List<Role> roles;
        if (null == name) {
            roles = roleService.queryAll(page, limit, sort, order);
        } else {
            roles = roleService.queryAllByName(page, limit, sort, order, name);
        }

        return new ResponseVO<>(new Data<>(roles, roles.size()), "成功", 0);
    }

    @RequestMapping(value = "role/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO roleCreate(@RequestBody Role role){
        String date = DateUtils.dateOfNow();
        {
            role.setUpdateTime(date);
            role.setDeleted(0);
            role.setAddTime(date);
            role.setEnabled(1);
        }
        Role role2 = roleService.saveRole(role);
        if (null != role2) {

            return new ResponseVO<>(role2, "成功", 0);
        } else {
            return new ResponseVO<>(null, "失败", 1);
        }
    }

    @RequestMapping(value = "role/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO roleUpdate(@RequestBody Role role){
        role.setUpdateTime(DateUtils.dateOfNow());
        if (roleService.update(role) != 0) {
            return new ResponseVO<>(role, "成功", 0);
        } else {
            return new ResponseVO<>(null, "失败", 1);
        }
    }

    @ResponseBody
    @RequestMapping("role/delete")
    public ResponseVO roleDelete(@RequestBody Role role) {
        int i = roleService.delete(role);
        if (i != 0) {
            return new ResponseVO<>(null, "成功", 0);
        } else return new ResponseVO<>(null, "失败", 1);
    }


}
