package com.springboot.mapper.UserMapper;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectAddress(@Param("pageDetail")PageDetail pageDetail, @Param("userId")String userId,@Param("name")String name);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    int selectAddressCount(String userId, String name);
}