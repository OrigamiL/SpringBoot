package com.zhezhi.vo;

import lombok.*;

/**
 * @Program: SpringBoot
 * @ClassName: Cat
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-22 16:50
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Cat {
    private String cardId;
    private String name;
    private Integer age;
}
