package com.ifan.hsf;

import com.ifan.mybatis.entity.User;

import java.util.List;

public interface HelloWorldService {
    public List<User> selectAll();
    public String sayHi(String name);
}
