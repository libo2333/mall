package com.springboot.mapper.admin;

import com.springboot.bean.admin.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {
    List<Log> queryAllLog();

    List<Log> queryLogAll(@Param("offset") int offset,
                          @Param("limit") int limit,
                          @Param("sort") String sort,
                          @Param("order") String order);

    List<Log> queryLogByName(@Param("offset") int offset,
                             @Param("limit") int limit,
                             @Param("sort") String sort,
                             @Param("order") String order,
                             @Param("name") String name);
}
