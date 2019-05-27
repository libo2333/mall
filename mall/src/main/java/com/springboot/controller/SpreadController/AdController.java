package com.springboot.controller.SpreadController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.SpreadBean.Ad;
import com.springboot.service.SpreadService.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("admin/ad")
public class AdController {
    @Autowired
    AdService adService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO ad(PageDetail pageDetail,String name,String content){
        pageDetail.setOffset();
        List<Ad> adList = adService.queryAdList(pageDetail,name,content);
        if (adList.isEmpty()&&adList==null){
            return new ResponseVO(null, "fail", 404);
        }else{
            data.setTotal(adList.size());
            data.setItems(adList);
            return new ResponseVO(data,"ok",0);
        }
    }

    @RequestMapping("create")
    @ResponseBody
    public ResponseVO createAd(@RequestBody Ad ad){
        int ret = adService.insertAd(ad);
        if (ret==1){
            ad = adService.queryAdByPrimaryKey(ad.getId());
            return new ResponseVO(ad,"ok",0);
        }else {
            return new ResponseVO(null,"fail",404);
        }
    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseVO updateAd(@RequestBody Ad ad){
        int ret = adService.updateAd(ad);
        if (ret==1){
            ad = adService.queryAdByPrimaryKey(ad.getId());
            return new ResponseVO(ad,"ok",0);
        }else {
            return new ResponseVO(null,"fail",404);
        }
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResponseVO deleteAd(@RequestBody Ad ad){
        int ret = adService.deleteAd(ad.getId());
        if (ret==1){
            //ad = adService.queryAdByPrimaryKey(ad.getId());
            return new ResponseVO(ad,"ok",0);
        }else {
            return new ResponseVO(null,"fail",404);
        }
    }
}
