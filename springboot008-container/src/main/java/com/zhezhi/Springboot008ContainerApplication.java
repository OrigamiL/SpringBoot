package com.zhezhi;

import com.zhezhi.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
* 通过代码从容器中获取对象，通过Application.run(Application.class,args);返回值获取容器。
* */
@SpringBootApplication
public class Springboot008ContainerApplication {

    public static void main(String[] args) {
        //获取容器对象
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot008ContainerApplication.class, args);
        //从容器中获取对象
        UserService userService = (UserService) ctx.getBean("userServiceImpl");
        userService.sayHello("张三");
    }

}
/*
* CommandLineRunner接口，ApplicationRunner接口
* 这两个接口都有一个run方法，在容器对象创建好之后，会自动执行run方法，可以完成自定义的在容器对象创建好的一些操作
* */