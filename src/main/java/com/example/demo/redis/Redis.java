package com.example.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Redis {
    @Autowired
    RedisTemplate redisTemplate;
    public void getRedis(){
        redisTemplate.boundSetOps("").add("");
    }
}
