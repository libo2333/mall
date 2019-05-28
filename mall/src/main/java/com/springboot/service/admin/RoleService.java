package com.springboot.service.admin;

import com.springboot.bean.admin.Role;


import java.util.HashMap;
import java.util.List;

public interface RoleService {
    List<HashMap<String, Object>> queryRoleIdAndName();

    List<Role> queryAll(int page, int limit, String sort, String order);

    Role saveRole(Role role);

    int update(Role role);

    int delete(Role role);

    List<Role> queryAllByName(int page, int limit, String sort, String order, String name);
}
