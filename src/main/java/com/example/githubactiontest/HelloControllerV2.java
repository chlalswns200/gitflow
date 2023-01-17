package com.example.githubactiontest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerV2 {

    @GetMapping
    public String hellohello() {
        return "hello world";
    }
}
