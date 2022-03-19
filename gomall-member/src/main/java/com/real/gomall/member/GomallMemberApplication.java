package com.real.gomall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.real.gomall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.real.gomall.member.feign")
public class GomallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallMemberApplication.class, args);
    }

}
