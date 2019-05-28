package com.springboot.mapper.admin;

import com.springboot.bean.admin.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    List<Admin> queryAllAdmin(@Param("offset") int offset,
                                      @Param("limit") int limit,
                                      @Param("sort") String sort,
                                      @Param("order") String order);

    int insertAdmin(Admin insertAdmin);

    List<Admin> queryAllAdminByName(@Param("offset") int offset,
                                            @Param("limit") int limit,
                                            @Param("sort") String sort,
                                            @Param("order") String order,
                                            @Param("name") String name);

    int update(Admin admin);

    int delete(Admin admin);
}
