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

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
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

    @RequestMapping("create")
    @ResponseBody
    public ResponseVO createAd(HttpServletRequest request){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = request.getReader();
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1){
                stringBuilder.append(buff,0,len);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
        String s = stringBuilder.toString();
        System.out.println(s);
        return null;
    }
}
