package com.tjx.tjxspringbootautoconfigure.config;

import com.tjx.tjxspringbootautoconfigure.bean.HelloProperties;
import com.tjx.tjxspringbootautoconfigure.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService getHelloService(){
        return new HelloService();
    }
}
