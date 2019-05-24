package com.springboot.service.admin;

import com.springboot.bean.admin.Admin;
import com.springboot.bean.admin.ResponseAdmin;

import java.util.List;


public interface AdminService {
    List<ResponseAdmin> queryAllAdmin(int page, int limit, String sort, String order);

    Admin queryAllAdminByUsername(int page, int limit, String username, String sort, String order);

    int insertAdmin(Admin admin);/*avatare,password,roleIds,username:*/

    Admin updateAdmin(Admin admin); /* addTime,id,password ,roleIds,updateTime,username*/

    int deleteAdmin(Admin admin);/* addTime,avatar, id,password, roleIds,updateTime, username*/


}
