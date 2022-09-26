package com.zhezhi.service.impl;

import com.zhezhi.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Program: SpringBoot
 * @ClassName: HelloServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-26 15:42
 **/

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好~"+name;
    }
}
