package com.system.services.interfaces;

import com.system.model.Student;
import com.system.model.StudentExample;

import java.util.List;

public interface IStudentService {
    int studentLogin(Integer student_id,String student_password);
    Student selectStudentByPK(Integer student_id);
    List<Student> selectClassesByCondition(StudentExample example);
}
