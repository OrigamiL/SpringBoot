package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: SpringBoot
 * @ClassName: LoginController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-26 17:13
 **/

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "登陆页面";
    }
    @RequestMapping("/userData")
    @ResponseBody
    public String userData(){
        return "用户信息页面";
    }
}
