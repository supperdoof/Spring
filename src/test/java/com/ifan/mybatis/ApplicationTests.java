package com.ifan.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)    //@RunWith(SpringRunner.class) 运行Junit并支持Spring-test特性 @SpringBootTest 为springApplication创建上下文并支持SpringBoot特性
@SpringBootTest
public class ApplicationTests {
    @Test
    public void contextLoads() {
        System.out.println("hello world");
    }
}
