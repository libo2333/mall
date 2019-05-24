package com.springboot.mapper.admin;

import com.springboot.bean.admin.Log;

import java.util.List;

public interface LogMapper {
    List<Log> queryAllLog();
}
