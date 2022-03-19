package com.real.gomall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.real.gomall.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GomallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallWareApplication.class, args);
    }



}
