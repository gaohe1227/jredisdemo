package com.redis.service;

public class RedisTestServiceImple  implements RedisTestService {
     @Override
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }

}
