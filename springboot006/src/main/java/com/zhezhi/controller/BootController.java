package com.zhezhi.controller;

import com.zhezhi.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.security.sasl.SaslClient;

/**
 * @Program: SpringBoot
 * @ClassName: BootController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-24 10:46
 **/

@Controller
public class BootController {

    @Value("${site}")
    private String site;
    @Value("${school.name}")
    private String name;
    @Resource(name = "schoolInfo")
    SchoolInfo schoolInfo;

    @RequestMapping("/hello")
    @ResponseBody
    public String queryData() {
        return site+"<br>"+name;
    }

    @RequestMapping("/schoolData")
    @ResponseBody
    public String querySchool() {
        return schoolInfo.toString();
    }
}
