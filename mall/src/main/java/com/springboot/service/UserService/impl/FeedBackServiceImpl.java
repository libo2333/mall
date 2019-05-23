package com.springboot.service.UserService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Feedback;
import com.springboot.mapper.UserMapper.FeedbackMapper;
import com.springboot.service.UserService.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    FeedbackMapper feedbackMapper;

    @Override
    public List<Feedback> querySearchHistoryList(PageDetail pageDetail, String username, String id) {
        List<Feedback> feedbackList = feedbackMapper.selectFeedBackList(pageDetail,username,id);
        return feedbackList;
    }
}
