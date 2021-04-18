package com.cumtb.rdmsspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdehao
 * 2021/4/17
 */
@RestController
public class AHelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
