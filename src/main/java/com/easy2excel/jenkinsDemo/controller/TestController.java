package com.easy2excel.jenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "app working fine";
    }
    @GetMapping("/")
    public String test1() {
        return " hi lipsa patra ";
    }
}
