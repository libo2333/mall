package com.springboot.service.admin.Impl;

import com.springboot.bean.admin.Role;
import com.springboot.bean.admin.Role;
import com.springboot.mapper.admin.RoleMapper;
import com.springboot.service.admin.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;


    @Override
    public List<HashMap<String, Object>> queryRoleIdAndName() {
        List<Role> roles = roleMapper.queryRoleIdAndName();
        HashMap<String, Object> stringObjectHashMap = null;
        ArrayList<HashMap<String, Object>> list= new ArrayList<>();
        for (Role e : roles) {

            stringObjectHashMap=new HashMap<>();
            stringObjectHashMap.put("label", e.getLabel());
            stringObjectHashMap.put("value", e.getValue());
            list.add(stringObjectHashMap);
        }
        return list;
    }

    @Override
    public List<Role> queryAll(int page, int limit, String sort, String order) {
        int offset = (page - 1) * limit;
        List<Role> roles = roleMapper.queryAll(offset, limit, sort, order);
        return roles;
    }

    @Override
    public Role saveRole(Role role) {
        try {
            int row = roleMapper.insertRole(role);
            if (row != 0) {
                int id = roleMapper.queryRoleIdByName(role);
                role.setId(id);
                return role;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public int update(Role role) {
        Role role1 = roleMapper.queryByName(role);

        if (null == role1 || role.getId() == role1.getId()) {
            return roleMapper.update(role);
        } else {
            return 0;
        }
    }

    @Override
    public int delete(Role role) {
        return roleMapper.delete(role);
    }

    @Override
    public List<Role> queryAllByName(int page, int limit, String sort, String order, String name) {
        int offset = (page - 1) * limit;
        name = "%" + name + "%";
        List<Role> roles = roleMapper.queryAllByName(offset, limit, sort, order, name);
        return roles;
    }
}
