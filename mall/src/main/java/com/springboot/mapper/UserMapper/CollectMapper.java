package com.springboot.mapper.UserMapper;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectCollectList(@Param("pageDetail")PageDetail pageDetail,@Param("userId")String userId,@Param("valueId")String valueId);

    Collect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    int selectCollectCount(String userId, String valueId);
}