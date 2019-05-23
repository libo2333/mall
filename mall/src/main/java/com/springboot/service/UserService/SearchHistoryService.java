package com.springboot.service.UserService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.SearchHistory;

import java.util.List;

public interface SearchHistoryService {
    List<SearchHistory> querySearchHistoryList(PageDetail pageDetail, String userId, String keyword);
}
