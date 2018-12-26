package com.system.services.impl;

import com.system.dao.interfaces.AdminMapper;
import com.system.dao.interfaces.StudentMapper;
import com.system.model.Admin;
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

    public int adminLogin(String admin_name, String admin_psw) {
        Admin db_admin = selectAdminByPK(admin_name);
        if (db_admin == null) {
            return -2;//管理员账号不存在
        }
        else {
            if(admin_psw.equals(db_admin.getAdmin_password())){
                return 1;//账号密码均正确
            }
            return -1;//密码不正确
        }
    }
    public Admin selectAdminByPK(String admin_name) {
        System.out.println();
        return sqlSessionFactory.openSession().getMapper(AdminMapper.class).selectByPrimaryKey(admin_name);
    }

}
