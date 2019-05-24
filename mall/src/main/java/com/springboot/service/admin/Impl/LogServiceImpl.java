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
    public List<Log> queryAllLog() {
        return logMapper.queryAllLog();
    }
}
