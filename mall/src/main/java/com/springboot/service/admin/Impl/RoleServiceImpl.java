package com.springboot.service.admin.Impl;

import com.springboot.bean.admin.Role;
import com.springboot.bean.admin.RoleLabelValue;
import com.springboot.mapper.admin.RoleMapper;
import com.springboot.service.admin.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;


    @Override
    public List<RoleLabelValue> queryRoleIdAndName() {
        return roleMapper.queryRoleIdAndName();
    }

    @Override
    public List<Role> queryAll(int page, int limit, String sort, String order) {
        int offset=(page-1)*limit;
        List<Role> roles=roleMapper.queryAll(offset,limit,sort,order);
        return roles;
    }
}
