package com.zhezhi.config;

import com.zhezhi.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Program: SpringBoot
 * @ClassName: MyAppConfig
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-26 17:04
 **/

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    //添加拦截器对象，注入到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new LoginInterceptor();
        String[] addPath = {"/user/**"};
        String[] excludePath = {"/user/login"};
        registry.addInterceptor(interceptor)
                .addPathPatterns(addPath)           /*拦截*/
                .excludePathPatterns(excludePath);  /*不拦截*/
    }
}
