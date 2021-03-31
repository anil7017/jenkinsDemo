package com.easy2excel.jenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "app working fine";
    }
    @GetMapping("/trs")
    public String test1() {
        return "jenkins demo app working fine 111111";
    }
}
