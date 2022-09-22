package com.zhezhi.vo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.Transient;

/**
 * @Program: SpringBoot
 * @ClassName: Tiger
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-22 17:34
 **/

@Component("tiger")
@ToString
public class Tiger {
    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private Integer age;
}
