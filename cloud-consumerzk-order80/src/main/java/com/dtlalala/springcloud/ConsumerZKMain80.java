package com.dtlalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZKMain80.class, args);
    }

}
