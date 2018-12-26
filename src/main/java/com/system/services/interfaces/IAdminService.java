package com.system.services.interfaces;


import com.system.model.Admin;
import com.system.model.Student;

public interface IAdminService {
    int AddStudentInfo(Student student);
    int adminLogin(String admin_name,String admin_psw);
    Admin selectAdminByPK(String admin_name);
}
