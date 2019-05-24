package com.springboot.controller.admin;

import com.springboot.bean.Data;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Log;
import com.springboot.service.admin.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminLogController {
    @Autowired
    LogService logService;
    @RequestMapping(value = "log/list",method = RequestMethod.OPTIONS)
    public void logOption(){

    }
    @RequestMapping(value = "log/list",method = RequestMethod.GET)
    public ResponseVO logList(@RequestParam("page") int page,
                              @RequestParam("limit") int limit,
                              @RequestParam("sort") String sort,
                              @RequestParam("order") String order){
        List<Log> logs = logService.queryAllLog();
        System.out.println(logs.get(1).getUpdateTime());/*2019-04-17 02:50:07*/
        System.out.println(logs.get(1).getUpdateTime().toString());/*Data类型不可靠啊*/
        ResponseVO responseVO = new ResponseVO(new Data<>(logs, logs.size()), "成功", 0);
        return responseVO;
    }
}
