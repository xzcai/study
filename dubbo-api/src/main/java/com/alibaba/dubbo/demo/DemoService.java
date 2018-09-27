package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @author: Mr.Wang
 * @create: 2018-09-11
 **/
public interface DemoService {
    List<String> getPermissions(Long id);
}
