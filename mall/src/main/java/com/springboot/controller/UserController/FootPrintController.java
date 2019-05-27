package com.springboot.controller.UserController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.FootPrint;
import com.springboot.service.UserService.FootPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin/footprint")
public class FootPrintController {

    @Autowired
    FootPrintService footPrintService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO footPrint(PageDetail pageDetail,String userId,String goodsId){
        pageDetail.setOffset();
        List<FootPrint> footPrintList = footPrintService.queryFootPrintList(pageDetail,userId,goodsId);
        if (footPrintList.isEmpty()&&footPrintList==null){
            return new ResponseVO(null,"fail",404);
        }else{
            data.setTotal(footPrintList.size());
            data.setItems(footPrintList);
            return new ResponseVO(data,"ok",0);
        }
    }
}
