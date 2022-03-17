package com.real.gomall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.real.gomall.coupon.dao")
@SpringBootApplication
public class GomallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallCouponApplication.class, args);
    }

}
