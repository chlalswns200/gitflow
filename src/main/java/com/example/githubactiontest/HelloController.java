package com.example.githubactiontest;

import com.example.githubactiontest.configuration.RedisConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class HelloController {

    private final RedisTemplate redisTemplate;

    @GetMapping("hello")
    public String hello() {
        return "action-test-hello";
    }
    @GetMapping("bye")
    public String bye() {

        ValueOperations valueOperations = redisTemplate.opsForValue();

        String key = "token";
        String value = "1qkwe12jerjnfgrf";
        valueOperations.set(key,value);

        return "action-test-bye!";
    }


    @GetMapping("bye2")
    public String bye2() {
        return "action-test-bye2";
    }
}
