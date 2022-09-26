package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Program: SpringBoot
 * @ClassName: BootController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-24 16:01
 **/

@Controller

public class JspController {
    @RequestMapping("/jsp")
    public String doSome(HttpServletRequest request) {
        request.setAttribute("data","SpringBoot使用jsp");
        //视图的逻辑名称
        return "index";
    }
    @RequestMapping("/admin")
    public String doOther(HttpServletRequest request) {
        request.setAttribute("data","SpringBoot使用jsp  admin");
        //视图的逻辑名称
        return "admin/admin";
    }
}
