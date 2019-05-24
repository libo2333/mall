package com.springboot.mapper.admin;

import com.springboot.bean.admin.Role;
import com.springboot.bean.admin.RoleLabelValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    List<RoleLabelValue> queryRoleIdAndName();

    List<Role> queryAll(@Param("offset") int offset,
                        @Param("limit")int limit,
                        @Param("sort")String sort,
                        @Param("order")String order);
}
