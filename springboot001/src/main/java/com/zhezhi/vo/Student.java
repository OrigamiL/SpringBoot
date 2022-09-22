package com.zhezhi.vo;

import lombok.*;

/**
 * @Program: SpringBoot
 * @ClassName: student
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-22 15:57
 **/

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Student {
    private String name;
    private Integer age;
    private String sex;

}
