package com.real.gomall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.real.gomall.member.dao")
@SpringBootApplication
public class GomallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallMemberApplication.class, args);
    }

}
