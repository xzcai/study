package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: Mr.Wang
 * @create: 2018-09-14
 **/
public class MyBeanFactory implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        MyBeanFactory.applicationContext=applicationContext;
    }
    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }
}
