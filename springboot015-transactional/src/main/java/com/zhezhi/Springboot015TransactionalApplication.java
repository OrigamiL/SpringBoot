package com.zhezhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zhezhi.dao")
@EnableTransactionManagement
public class Springboot015TransactionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot015TransactionalApplication.class, args);
    }

}
