package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: Mr.Wang
 * @create: 2018-09-11
 **/
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
