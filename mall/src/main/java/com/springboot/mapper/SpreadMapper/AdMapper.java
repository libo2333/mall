package com.springboot.mapper.SpreadMapper;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Ad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Ad record);

    int insertSelective(Ad record);

    List<Ad> selectAdList(@Param("pageDetail")PageDetail pageDetail,@Param("name")String name,@Param("content")String content);

    Ad selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);
}