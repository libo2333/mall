package com.springboot.service.admin;

import com.springboot.bean.admin.Admin;

import java.util.HashMap;
import java.util.List;


public interface AdminService {
    List<HashMap<String, Object>> queryAllAdmin(int page, int limit, String sort, String order);


    int updateAdmin(Admin admin); /* addTime,id,password ,roleIds,updateTime,username*/

    int deleteAdmin(Admin admin);/* addTime,avatar, id,password, roleIds,updateTime, username*/


    int insertAdmin(Admin insertAdmin);

    List<HashMap<String, Object>> queryAllAdminByName(int page, int limit, String sort, String order, String username);
}
