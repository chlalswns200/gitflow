package com.example.githubactiontest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "action-test-hello";
    }
    @GetMapping("bye")
    public String bye() {
        return "action-test-bye";
    }

    @GetMapping("bye2")
    public String bye2() {
        return "action-test-bye2";
    }
}
