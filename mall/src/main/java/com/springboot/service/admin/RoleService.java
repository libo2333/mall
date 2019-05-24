package com.springboot.service.admin;

import com.springboot.bean.admin.Role;
import com.springboot.bean.admin.RoleLabelValue;

import java.util.List;

public interface RoleService {
    List<RoleLabelValue> queryRoleIdAndName();

    List<Role> queryAll(int page, int limit, String sort, String order);
}
