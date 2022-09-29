package com.zhezhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zhezhi.dao")//该注解用于找到Dao接口和Mapper文件
@EnableTransactionManagement
public class Springboot014MapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot014MapperApplication.class, args);
    }

}
