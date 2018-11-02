package com.ifan.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ifan.mybatis.mapper")  //指明mapper位置 mapper类不用再加@Mapper注解
public class Application {
    public static void main(String args[])
    {
        SpringApplication.run(Application.class,args);
    }
}
