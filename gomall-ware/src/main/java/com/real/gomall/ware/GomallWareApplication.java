package com.real.gomall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.real.gomall.ware.dao")
@SpringBootApplication
public class GomallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallWareApplication.class, args);
    }

}
