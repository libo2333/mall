package com.springboot.controller.UserController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.SearchHistory;
import com.springboot.service.UserService.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("history")
public class SearchHistoryController {

    @Autowired
    SearchHistoryService searchHistoryService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO history(PageDetail pageDetail, String userId, String keyword){
        pageDetail.setOffset();
        List<SearchHistory> searchHistoryList = searchHistoryService.querySearchHistoryList(pageDetail,userId,keyword);
        if (searchHistoryList.isEmpty()&&searchHistoryList==null){
            return new ResponseVO(null, "fail", 404);
        }else {
            data.setTotal(searchHistoryList.size());
            data.setItems(searchHistoryList);
            return new ResponseVO(data,"ok",0);
        }
    }
}
