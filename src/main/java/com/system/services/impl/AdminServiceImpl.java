package com.system.services.impl;

import com.system.dao.interfaces.StudentMapper;
import com.system.model.Student;
import com.system.services.interfaces.IAdminService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements IAdminService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public int AddStudentInfo(Student student) {
        return sqlSessionFactory.openSession().getMapper(StudentMapper.class).insertSelective(student);
    }
}
