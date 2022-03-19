package com.real.gomall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.real.gomall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GomallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallCouponApplication.class, args);
    }

}
