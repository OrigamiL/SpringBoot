package com.zhezhi.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Program: SpringBoot
 * @ClassName: MyFilter
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-27 15:18
 **/

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("使用了servlet中的filter对象");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
