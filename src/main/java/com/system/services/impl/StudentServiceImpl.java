package com.system.services.impl;

import com.system.dao.interfaces.StudentMapper;
import com.system.model.Student;
import com.system.model.StudentExample;
import com.system.services.interfaces.IStudentService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private StudentExample studentExample;
    public int studentLogin(Integer student_id, String student_password) {
        Student db_student = selectStudentByPK(student_id);
        if (db_student == null) {
            return -2;//学生账号不存在
        }
        else {
            if(student_password.equals(db_student.getPassword())){
                return 1;//账号密码均正确
            }
            return -1;//密码不正确
        }
    }
    public Student selectStudentByPK(Integer student_id) {
        studentExample.clear();
        studentExample.createCriteria().andStudent_idEqualTo(student_id);
        return sqlSessionFactory.openSession().getMapper(StudentMapper.class).selectByPrimaryKey(student_id);
    }
    public List<Student> selectClassesByCondition(StudentExample example) {
        return sqlSessionFactory.openSession().getMapper(StudentMapper.class).selectByExample(studentExample);
    }
}