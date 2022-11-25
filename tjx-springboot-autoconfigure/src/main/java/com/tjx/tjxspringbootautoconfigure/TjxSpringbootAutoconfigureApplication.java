package com.tjx.tjxspringbootautoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TjxSpringbootAutoconfigureApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(TjxSpringbootAutoconfigureApplication.class, args);
        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

}
