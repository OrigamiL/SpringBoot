package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: SpringBoot
 * @ClassName: FilterController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-27 15:25
 **/

@Controller
public class FilterController {
    @RequestMapping("/user/login")

    public String doLogin() {
        return "myServlet";
    }
    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        return "query";
    }
}
