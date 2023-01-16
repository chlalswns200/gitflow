package com.example.githubactiontest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "action-test";
    }
}
