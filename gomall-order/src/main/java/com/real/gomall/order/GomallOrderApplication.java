package com.real.gomall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.real.gomall.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GomallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallOrderApplication.class, args);
    }

}
