package com.system.services.interfaces;

import com.system.model.RewardPunishRecord;
import com.system.model.Student;
import com.system.model.StudentExample;

import java.util.List;

public interface IStudentService {
    int studentLogin(Integer student_id,String student_password);
    Student selectStudentByPK(Integer student_id);
    List<Student> selectClassesByCondition(StudentExample example);
    List<Student> selectStudentsByClassID(Integer class_id);
    int updateStudentByExampleSelective(Student student, StudentExample studentExample);
    int deleteStudentByPK(Integer student_id);
    List<RewardPunishRecord> getAllmyRPrecord(Integer student_id);
}
