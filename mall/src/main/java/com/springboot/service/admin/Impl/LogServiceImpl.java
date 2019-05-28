package com.springboot.service.admin.Impl;

import com.springboot.bean.admin.Log;
import com.springboot.mapper.admin.LogMapper;
import com.springboot.service.admin.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogMapper logMapper;


    @Override
    public List<Log> queryAllLog(int page, int limit, String sort, String order) {
        int offset=(page-1)*limit;
        List<Log> logs=logMapper.queryLogAll( offset,  limit, sort,  order);
        return logs;
    }

    @Override
    public List<Log> queryAllByName(int page, int limit, String sort, String order, String name) {
        int offset=(page-1)*limit;
        name="%"+name+"%";
        return logMapper.queryLogByName( offset,  limit, sort,  order,name);
    }
}
