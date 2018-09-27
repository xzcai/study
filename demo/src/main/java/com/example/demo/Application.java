package com.example.demo;

import DubboDemo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Mr.Wang
 * @create: 2018-09-14
 **/
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        Person cat = context.getBean(Person.class);
        System.out.println(cat);
    }
}
