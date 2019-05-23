package com.springboot.mapper.UserMapper;


import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.FootPrint;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FootPrintMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(FootPrint record);

    int insertSelective(FootPrint record);

    List<FootPrint> selectFootPrintList(@Param("pageDetail")PageDetail pageDetail,@Param("userId")String userId,@Param("goodsId")String goodsId);

    FootPrint selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(FootPrint record);

    int updateByPrimaryKey(FootPrint record);
}