package com.zhezhi.vo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Program: SpringBoot
 * @ClassName: SchoolInfo
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-24 11:22
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Component
@ConfigurationProperties(prefix = "school")//可以将配置文件中的配置封装到对象中
public class SchoolInfo {
    private String name;
    private String website;
    private String address;
}
