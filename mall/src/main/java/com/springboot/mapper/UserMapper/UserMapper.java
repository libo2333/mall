package com.springboot.mapper.UserMapper;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> queryUserList(@Param("pageDetail") PageDetail pageDetail,@Param("username")String username,@Param("mobile")String mobile);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int selectUserCount(String username,String mobile);
    /*微信登陆*/
    User queryUserByCode(String code);
}