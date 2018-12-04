package com.ifan.hsf;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextStartedEvent;

@SpringBootApplication  //入口类Application的启动注解
@MapperScan("com.ifan.mybatis.mapper")  //指明mapper位置 mapper类不用再加@Mapper注解
public class Application implements ApplicationListener<ContextStartedEvent> {  //ApplicationListener：监听器 ContextStartedEvent：spring boot启动开始时执行的事件
    @Autowired  //如果一个bean的数据类型与其它bean属性的数据类型相同，将自动兼容装配它。
            HelloWorldService helloWorldService;

    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.err.println(helloWorldService.sayHi("Error"));    //输出错误
    }

    public static void main(String args[])
    {
        PandoraBootstrap.run(args); // 启动 Pandora Boot 用于加载 Pandora 容器
//        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class,args);
//        configurableApplicationContext.start();
        SpringApplication.run(Application.class,args);  //SpringApplication类的run()方法往往在Spring应用的入口类中被调用，以启动Spring应用。
        PandoraBootstrap.markStartupAndWait();  // 标记服务启动完成,并设置线程 wait。防止业务代码运行完毕退出后，导致容器退出。
    }
}

