package com.tjx.tjxspringbootautoconfigure.service;

import com.tjx.tjxspringbootautoconfigure.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class HelloService {
    @Autowired
    private HelloProperties properties;

    public String getHello(String username){
        return properties.getName() + "..." + username + "..." + properties.getAge();
    }
}
