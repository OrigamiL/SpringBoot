package com.zhezhi.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Program: SpringBoot
 * @ClassName: LoginInterceptor
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-26 17:01
 **/


public class LoginInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截的控制器对象
     * @return boolean
     *          true：请求能被controller而处理
     *          false：请求被截断
     * @throws Exception 异常
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("执行了LoginInterceptor中的preHandle方法~");
        return false;
    }
}
