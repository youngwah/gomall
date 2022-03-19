package com.real.gomall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GomallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomallGatewayApplication.class, args);
    }

}
