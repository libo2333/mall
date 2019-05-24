package com.springboot.mapper.admin;

import com.springboot.bean.admin.Admin;
import com.springboot.bean.admin.ResponseAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    List<ResponseAdmin> queryAllAdmin(@Param("offset") int offset,
                                      @Param("limit") int limit,
                                      @Param("sort") String sort,
                                      @Param("order") String order);

}
