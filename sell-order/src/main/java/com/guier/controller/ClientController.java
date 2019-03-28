package com.guier.controller;

import com.guier.feign.Orderfeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private Orderfeign orderfeign;

    @GetMapping("/msg")
    public String msg() {
        return orderfeign.msg();
    }

    @PostMapping("/list")
    public List listForOrder() {
        List list = orderfeign.listForOrder(Arrays.asList("11"));
        return list;
    }

}