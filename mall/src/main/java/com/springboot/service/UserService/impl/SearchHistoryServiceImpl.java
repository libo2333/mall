package com.springboot.service.UserService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.SearchHistory;
import com.springboot.mapper.UserMapper.SearchHistoryMapper;
import com.springboot.service.UserService.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchHistoryServiceImpl implements SearchHistoryService {

    @Autowired
    SearchHistoryMapper searchHistoryMapper;

    @Override
    public List<SearchHistory> querySearchHistoryList(PageDetail pageDetail, String userId, String keyword) {
        List<SearchHistory> searchHistoryList = searchHistoryMapper.selectSearchHistoryList(pageDetail,userId,keyword);
        return searchHistoryList;
    }
}
