package com.guier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SellConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SellConfigApplication.class, args);
    }
}
