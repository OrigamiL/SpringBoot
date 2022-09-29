package com.zhezhi.controller;

import com.zhezhi.model.Student;
import com.zhezhi.service.StudentService;
import org.apache.ibatis.annotations.Param;
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
 * @Create-Date: 2022-09-29 16:14
 **/

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudent(@Param("id") Integer id) {
        Student student = studentService.queryStudent(id);
        return student.toString();
    }
}
