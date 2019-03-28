package com.guier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@EnableFeignClients(basePackages = "com.imooc.product.client")
@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//@SpringCloudApplication
//@ComponentScan(basePackages = "com.imooc")
public class SellOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SellOrderApplication.class, args);
	}
}
