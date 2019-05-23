package com.springboot.mapper.UserMapper;


import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Feedback;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FeedbackMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectFeedBackList(@Param("pageDetail")PageDetail pageDetail,@Param("username")String username,@Param("id")String id);

    Feedback selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}