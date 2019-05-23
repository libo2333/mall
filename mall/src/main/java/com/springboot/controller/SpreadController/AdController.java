package com.springboot.controller.SpreadController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.service.SpreadService.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ad")
public class AdController {
    @Autowired
    AdService adService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO ad(PageDetail pageDetail,String name,String content){
        pageDetail.setOffset((pageDetail.getPage()-1)*pageDetail.getLimit());
        List<Ad> adList = adService.queryAdList(pageDetail,name,content);
        if (adList.isEmpty()&&adList==null){
            return new ResponseVO(null, "fail", 404);
        }else{
            data.setTotal(adList.size());
            data.setItems(adList);
            return new ResponseVO(data,"ok",0);
        }
    }
}
