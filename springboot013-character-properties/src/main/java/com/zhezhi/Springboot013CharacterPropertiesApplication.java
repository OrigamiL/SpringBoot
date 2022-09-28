package com.zhezhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Springboot013CharacterPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot013CharacterPropertiesApplication.class, args);
    }

}
