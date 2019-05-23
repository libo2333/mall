package com.springboot.mapper.UserMapper;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.SearchHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchHistoryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SearchHistory record);

    int insertSelective(SearchHistory record);

    List<SearchHistory> selectSearchHistoryList(@Param("pageDetail")PageDetail pageDetail,@Param("userId")String userId,@Param("keyword")String keyword);

    SearchHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SearchHistory record);

    int updateByPrimaryKey(SearchHistory record);
}