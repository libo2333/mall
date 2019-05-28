package com.springboot.service.admin.Impl;

import com.springboot.bean.admin.Admin;
import com.springboot.mapper.admin.AdminMapper;
import com.springboot.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;


    @Override
    public List<HashMap<String, Object>> queryAllAdmin(int page, int limit, String sort, String order) {
        int offset = (page - 1) * limit;
        List<Admin> Admins = adminMapper.queryAllAdmin(offset, limit, sort, order);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        for (Admin admin : Admins) {
            HashMap<String, Object> hashMap = new HashMap<>();
            Integer[] roleIds = admin.getRoleIds();
            ArrayList arrayList = new ArrayList();
            for (Integer i : roleIds) {
                arrayList.add(i);
            }
            hashMap.put("roleIds", arrayList);
            hashMap.put("id", admin.getId());
            hashMap.put("avatar",admin.getAvatar());
            hashMap.put("username",admin.getUsername());
            list.add(hashMap);
        }
        return list;
    }


    @Override
    public int updateAdmin(Admin admin) {
        return adminMapper.update(admin);
    }

    @Override
    public int deleteAdmin(Admin admin) {
        return adminMapper.delete(admin);
    }

    @Override
    public int insertAdmin(Admin insertAdmin) {
        return adminMapper.insertAdmin(insertAdmin);
    }

    @Override
    public List<HashMap<String, Object>> queryAllAdminByName(int page, int limit, String sort, String order, String username) {
        int offset = (page - 1) * limit;
        username = "%" + username + "%";
        List<Admin> admins = adminMapper.queryAllAdminByName(offset, limit, sort, order, username);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        for (Admin admin : admins) {
            HashMap<String, Object> hashMap = new HashMap<>();
            Integer[] roleIds = admin.getRoleIds();
            ArrayList arrayList = new ArrayList();
            for (Integer i : roleIds) {
                arrayList.add(i);
            }
            hashMap.put("roleIds", arrayList);
            hashMap.put("id", admin.getId());
            hashMap.put("avatar",admin.getAvatar());
            hashMap.put("username",admin.getUsername());
            list.add(hashMap);
        }
        return list;
    }


}
