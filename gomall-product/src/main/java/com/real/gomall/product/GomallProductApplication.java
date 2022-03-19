package com.real.gomall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.real.gomall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GomallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallProductApplication.class, args);
    }

}
