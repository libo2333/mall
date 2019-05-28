package com.springboot.mapper.admin;

import com.springboot.bean.admin.Role;
import com.springboot.bean.admin.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    List<Role> queryRoleIdAndName();

    List<Role> queryAll(@Param("offset") int offset,
                        @Param("limit") int limit,
                        @Param("sort") String sort,
                        @Param("order") String order);

    int insertRole(Role role);

    List<Role> queryAllRole();

    int update(Role role);


    Role queryByName(Role role);

    int delete(Role role);

    List<Role> queryAllByName(int offset, int limit, String sort, String order, String name);

    int queryRoleIdByName(Role role);
}
