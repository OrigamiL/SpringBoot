package com.zhezhi.service.impl;

import com.zhezhi.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Program: SpringBoot
 * @ClassName: UserServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-26 15:12
 **/

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了service方法的sayHello："+name);
    }
}
