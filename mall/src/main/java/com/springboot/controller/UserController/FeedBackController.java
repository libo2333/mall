package com.springboot.controller.UserController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.Feedback;
import com.springboot.service.UserService.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin/feedback")
public class FeedBackController {

    @Autowired
    FeedBackService feedBackService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO feedback(PageDetail pageDetail,String username,String id){
        pageDetail.setOffset();
        List<Feedback> feedbackList = feedBackService.querySearchHistoryList(pageDetail,username,id);
        if (feedbackList.isEmpty()&&feedbackList==null){
            return new ResponseVO(null, "fail", 404);
        }else {
            data.setTotal(feedbackList.size());
            data.setItems(feedbackList);
            return new ResponseVO(data,"ok",0);
        }
    }
}
