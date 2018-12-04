package com.ifan.hsf.provider;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.ifan.hsf.HelloWorldService;
import com.ifan.mybatis.entity.User;
import com.ifan.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@HSFProvider(serviceInterface = HelloWorldService.class)
public class HelloWorldServiceImpl implements HelloWorldService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public String sayHi(String name) {
        return name;
    }
}
