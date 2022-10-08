package com.zhezhi.servlce.impl;

import com.zhezhi.dao.StudentMapper;
import com.zhezhi.model.Student;
import com.zhezhi.servlce.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Program: SpringBoot
 * @ClassName: StudentServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-10-08 16:47
 **/

/**
 * * @Transactional:表示方法有事务支持
 * 默认：使用库的隔离级别， REQUIRED 传播行为；
 *      超时时间 -1；
 *      抛出运行时异常回滚事务
 */
@Service

public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    @Transactional(noRollbackForClassName="ArithmeticException")
    public int addStudent(Student student) {
        System.out.println("业务方法的addStudent");
        int rows = studentMapper.insert(student);
        System.out.println("执行sql语句");
        //抛出一个运行时异常，目的是回滚事务
        System.out.println(1/0);
        return rows;
    }
}
