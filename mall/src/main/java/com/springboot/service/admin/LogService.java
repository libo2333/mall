package com.springboot.service.admin;

import com.springboot.bean.admin.Log;

import java.util.List;

public interface LogService {

    List<Log> queryAllLog();
}
