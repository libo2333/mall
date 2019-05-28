package com.springboot.service.admin;

import com.springboot.bean.admin.Log;

import java.util.List;

public interface LogService {

    List<Log> queryAllLog(int page, int limit, String sort, String order);

    List<Log> queryAllByName(int page, int limit, String sort, String order, String name);
}
