package com.zhezhi;

import com.zhezhi.vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
* @SpringBootApplication是一个复合注解
* 由@SpringBootConfiguration
*   @EnableAutoConfiguration
*   @ComponentScan
* 组成
*
* 1.@SpringBootConfiguration
* 因为@SpringBootConfiguration包含@Configuration 所以该类可以声明对象，注入到容器中
* 使用了@SpringBootConfiguration注解标注的类，可以作为配置文件使用的，可以使用Bean声明对象，注入到容器中
* 2.@EnableAutoConfiguration
* 启用自动配置，把java对象配置好，注入到spring容器中。例如可以把mybatis的对象创建好，放入到容器中
* 3.@ComponentScan 注解扫描器
* 默认扫描的包：@ComponentScan所在的类所在的包和子包。
*
* SpringBoot的配置文件
* 配置文件名称：application
* 拓展名有properties(k=v); yml(k: v)
* application.properties
* application.yml
*
* */
@SpringBootApplication
public class Springboot003Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot003Application.class, args);
    }
    @Bean
    public Student student() {
        return new Student("张三","男",11);
    }
}
