package com.zhezhi.controller;

import com.zhezhi.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: SpringBoot
 * @ClassName: HelloSpringBoot
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-23 15:33
 **/

@Controller
public class HelloSpringBoot {
    @Autowired
    Student student;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot() {

        return student.toString();
    }
}
