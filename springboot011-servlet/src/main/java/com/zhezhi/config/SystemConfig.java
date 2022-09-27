package com.zhezhi.config;

import com.zhezhi.web.MyFilter;
import com.zhezhi.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;

/**
*@Program: SpringBoot
*@ClassName: SystemConfig
*@Version: 1.0
*@Description:
*@Author: zhezhi
*@Create-Date: 2022-09-27 14:25
**/

@Configuration
public class SystemConfig {
    @Bean
    public ServletRegistrationBean<Servlet> servletRegistrationBean() {
        /*ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>();
        // public ServletRegistrationBean(T servlet, String... urlMappings)
        //第一个参数是Servlet对象，第二个是url地址
        bean.setServlet(new MyServlet());
        bean.setUrlMappings("/myServlet","/login");
        return bean;*/
        return new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
    }
    @Bean
    public FilterRegistrationBean<Filter> filterFilterRegistrationBean() {
        FilterRegistrationBean<Filter> reg = new FilterRegistrationBean<>();
        reg.setFilter(new MyFilter());
        //  /不会拦截页面，只会拦截路径。/* 会拦截路径和页面
        //  /* 是拦截所有的文件夹，不包含子文件夹
        //  /** 是拦截所有的文件夹及里面的子文件夹

        reg.addUrlPatterns("/user/*");
        return reg;
    }
}
