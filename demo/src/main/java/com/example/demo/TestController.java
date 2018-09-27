package com.example.demo;

import DubboDemo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Mr.Wang
 * @create: 2018-09-14
 **/
@Controller
public class TestController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        Person person = (Person) MyBeanFactory.getBean(Person.class);

        return null;
    }
}
