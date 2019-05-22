package com.cskaoyan.mall_springboot.mapper.UserMapper;

import com.cskaoyan.mall_springboot.bean.UserBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select username,password from cskaoyan_mall_user where username = #{user.username} and password = #{user.password}")
    User login(@Param("user") User user);
}
