package com.dtlalala.springcloud.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        // NONE -- 默认的
        // BASIC -- 记录请求方法、URL、响应状态码和执行时间
        // HEADERS -- 除了BASIC之外，还有请求和响应的头信息
        // FULL -- 除了HEADERS之外，还有请求和响应的正文及元数据
        return Logger.Level.FULL;
    }

}
