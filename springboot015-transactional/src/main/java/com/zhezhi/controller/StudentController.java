package com.zhezhi.controller;

import com.zhezhi.model.Student;
import com.zhezhi.servlce.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Program: SpringBoot
 * @ClassName: StudentController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-10-08 16:56
 **/

@Controller
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class StudentController {

    private final StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = studentService.addStudent(student);
        return "添加学生成功，添加了"+rows+"行";
    }
}
