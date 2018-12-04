package com.ifan.hsf.consumer;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.ifan.hsf.HelloWorldService;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HsfConsumerConfiguration {
    @HSFConsumer
    HelloWorldService helloWorldService;
}
