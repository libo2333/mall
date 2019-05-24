package com.springboot.service.admin.Impl;

import com.springboot.bean.admin.Admin;
import com.springboot.bean.admin.ResponseAdmin;
import com.springboot.mapper.admin.AdminMapper;
import com.springboot.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;


    @Override
    public List<ResponseAdmin> queryAllAdmin(int page, int limit, String sort, String order) {
        /*分页逻辑*/

        int offset=(page-1)*limit;

        List<ResponseAdmin> responseAdmins = adminMapper.queryAllAdmin(offset, limit, sort, order);
        return responseAdmins;
    }

    @Override
    public Admin queryAllAdminByUsername(int page, int limit, String username, String sort, String order) {
        return null;
    }

    @Override
    public int insertAdmin(Admin admin) {
        return 0;
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return null;
    }

    @Override
    public int deleteAdmin(Admin admin) {
        return 0;
    }
}
