package com.springboot.controller.UserController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.Collect;
import com.springboot.service.UserService.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("collect")
public class CollectController {

    @Autowired
    CollectService collectService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO collect(PageDetail pageDetail,String userId,String valueId){
        pageDetail.setOffset();
        List<Collect> collectList = collectService.queryCollectList(pageDetail,userId,valueId);
        if (collectList.isEmpty()&&collectList==null){
            return new ResponseVO(null,"fail",404);
        }else {
            data.setTotal(collectList.size());
            data.setItems(collectList);
            return new ResponseVO(data,"ok",0);
        }
    }
}
