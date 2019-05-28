package com.springboot.controller.admin;

import com.springboot.bean.Data;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Log;
import com.springboot.service.admin.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RequestMapping("admin")
@RestController
public class LogController {
    @Autowired
    LogService logService;
    @RequestMapping(value = "log/list",method = RequestMethod.GET)
    public ResponseVO logList(@RequestParam("page") int page,
                              @RequestParam("limit") int limit,
                              @RequestParam("sort") String sort,
                              @RequestParam("order") String order,
                              HttpServletRequest httpServletRequest){
        String name = httpServletRequest.getParameter("name");
        List<Log> logs;
        if (name==null){
            logs= logService.queryAllLog(page,limit,sort,order);
        }else {
            logs=logService.queryAllByName(page,limit,sort,order,name);
        }
        return new ResponseVO<>(new Data<>(logs),"成功",0);
    }
}
