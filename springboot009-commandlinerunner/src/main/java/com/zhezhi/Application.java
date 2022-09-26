package com.zhezhi;

import com.zhezhi.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner{

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        SpringApplication.run(Application.class, args);
        System.out.println("容器对象创建之后");

    }

    @Override
    public void run(String... args) throws Exception {
        //可以做自定义的工作
        System.out.println("容器创建好执行run方法");
        //调用容器中的对象
        String s = helloService.sayHello("王五");
        System.out.println(s);

    }
}
