package com.guier.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
@FeignClient(name = "sell-product")
public interface Orderfeign {
    @GetMapping("/msg")
    public String msg();

    @PostMapping("/product/listForOrder")
    public List listForOrder(@RequestBody List<String> productIdList);
}
