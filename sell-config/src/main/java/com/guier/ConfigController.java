package com.guier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/config")
public class ConfigController {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String serviceId;

    @PostMapping("/sync")
    public Object sync() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        ServiceInstance serviceInstance = loadBalancerClient.choose(serviceId);
        System.out.println(serviceId);
        String url = String.format("http://%s:%s/actuator/bus-refresh", serviceInstance.getHost(), serviceInstance.getPort());
        System.out.println(url);
        restTemplate.postForObject(url, map, Object.class);
        map.put("code", 0);
        return map;
    }
}