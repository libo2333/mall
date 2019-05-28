package com.springboot.mapper.wx.category;

import com.springboot.bean.wx.category.Goods;
import com.springboot.bean.wx.home.FloorGoodsData;

import java.util.List;

public interface GoodsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectGoodsList(int id);

}