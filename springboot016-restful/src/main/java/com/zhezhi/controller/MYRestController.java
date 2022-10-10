package com.zhezhi.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Program: SpringBoot
 * @ClassName: RestController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-10-10 14:17
 **/

@RestController
public class MYRestController {
    //学习restful相关注解

    /**
     * *@PathVariable 获取url中的数据
     *  属性： value  路径变量名
     *  位置： 放在控制器方法的形参前面
     */
    @GetMapping("/student/{id}")
    public String queryStudent(
            @PathVariable(value = "id")
            Integer id
    ) {
        return "查询学生的id："+id.toString();
    }
    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,@PathVariable("age") Integer age) {
        return "创建了学生姓名："+name+"<br>年龄："+age;
    }
    @PutMapping("/student/{id}/{name}/{age}")
    //当路径变量名和形参名一样，@PathVariable 中的value可以省略
    public String modifyStudent(
            @PathVariable Integer id,
            @PathVariable String name,
            @PathVariable Integer age){
        return "修改学生id:"+id+"<br>姓名："+name+"<br>年龄"+age;
    }
    /**
     * 删除资源
     */
    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable Integer id) {
        return "删除学生id"+id;
    }
    /**
     * 过滤器org.springframework.web.filter.HiddenHttpMethodFilter
     * 作用：把请求中的post请求转为put,delete
     * yml中开启
     */
    @PutMapping("/student/test")
    public String test() {
        return "测试put";
    }
}
