package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @Program: SpringBoot
 * @ClassName: BootController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-23 17:28
 **/

@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome() {
        return "hello SpringBoot，设置了端口";
    }
}
