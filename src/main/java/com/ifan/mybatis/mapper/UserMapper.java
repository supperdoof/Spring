package com.ifan.mybatis.mapper;


import com.ifan.mybatis.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {
    @Select("select * from users where id = #{id}")
    User selectById(int id );

    @Select("select * from users")
    List<User> selectAll();
}
