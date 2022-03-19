package com.real.gomall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.real.gomall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GomallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallMemberApplication.class, args);
    }

}
