package com.ifan.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
@SpringBootConfiguration这个注解的作用与@Configuration作用相同，都是用来声明当前类是一个配置类．
@EnableAutoConfiguration是springboot实现自动化配置的核心注解，通过这个注解把spring应用所需的bean注入容器中．
@Service,@Repository,@Component,@Controller用来定义一个bean.@ComponentScan注解就是用来自动扫描被这些注解标识的类，最终生成ioc容器里的bean．
*/
@SpringBootApplication  // @SpringBootApplication 被 @Configuration、@EnableAutoConfiguration、@ComponentScan 注解所修饰
@MapperScan("com.ifan.mybatis.mapper")  //指明mapper位置 mapper类不用再加@Mapper注解
public class Application {
    public static void main(String args[])
    {
        SpringApplication.run(Application.class,args);
    }
}
