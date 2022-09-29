package com.zhezhi.service.impl;

import com.zhezhi.dao.StudentDao;
import com.zhezhi.model.Student;
import com.zhezhi.service.StudentService;
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
 * @Create-Date: 2022-09-29 16:03
 **/

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        return studentDao.selectById(id);
    }
}
