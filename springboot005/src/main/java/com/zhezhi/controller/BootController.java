package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: SpringBoot
 * @ClassName: BootController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-24 10:16
 **/

@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome() {
        return "springboot多环境配置";
    }
}
