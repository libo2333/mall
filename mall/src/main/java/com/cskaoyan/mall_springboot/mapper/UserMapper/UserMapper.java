package com.cskaoyan.mall_springboot.mapper.UserMapper;

import com.cskaoyan.mall_springboot.bean.UserBean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    @Select("select username,password from j13_user_t where username = #{user.username} and password = #{user.password}")
    User login(@Param("user") User user);
}
