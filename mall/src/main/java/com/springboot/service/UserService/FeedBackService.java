package com.springboot.service.UserService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Feedback;

import java.util.List;

public interface FeedBackService {
    List<Feedback> querySearchHistoryList(PageDetail pageDetail, String username, String id);
}
