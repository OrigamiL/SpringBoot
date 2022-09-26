package com.zhezhi.vo;

import lombok.*;

/**
 * @Program: SpringBoot
 * @ClassName: Student
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-23 16:17
 **/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Student {
    private String name;
    private String sex;
    private Integer age;
}
