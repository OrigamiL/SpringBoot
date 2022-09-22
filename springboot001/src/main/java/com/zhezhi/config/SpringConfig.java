package com.zhezhi.config;

import com.zhezhi.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @Program: SpringBoot
 * @ClassName: SpringConfig
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-22 16:16
 **/

//这个注解表示当前类是作为配置文件使用的，就是用来配置容器的。 SpringConfig这个类就相当于beans.xml
@Configuration

//该注解是导入xml配置，等于<import resources="其他配置文件">标签,可以指定多个值{"",""}
@ImportResource(value = "classpath:applicationContext.xml")

/*
* @PropertySource 是读取properties属性配置文件。 使用属性配置文件可以实现外部化配置，在程序代码之外提供数据
* 步骤：1.在resources目录下创建properties文件，使用k=v的格式提供数据
*      2.在PropertySource 指定properties文件的位置
*      3.使用@Value(value="${key}")
* */
@PropertySource(value = "classpath:config.properties", encoding = "UTF-8")
@ComponentScan(basePackages = "com.zhezhi.vo")

public class SpringConfig {
    /*
    * 创建方法，方法的返回值是对象，方法对象上面加入@Bean
    * 方法的返回值对象就注入到容器中
    *
    * @Bean:把对象注入到容器中，作用相当于<bean/>标签
    * 位置：方法的上面
    * 说明：如果不指定对象的名称，默认是方法名是id
    * */
    @Bean
    public Student createStudent(){
        return new Student("李四",12,"女");
    }
    @Bean(name = "stu")
    public Student createStudent2(){
        return new Student("王五",22,"女");
    }
}
