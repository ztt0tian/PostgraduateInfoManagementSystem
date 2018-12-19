package com.system.services.impl;

import com.system.model.Student;
import com.system.services.interfaces.IAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-mvc.xml","classpath:/config/spring-mybatis.xml"})
public class AdminServiceImplTest {
    @Autowired
    private IAdminService adminService;
    @Test
    public void addStudentInfo() {
        Student student = new Student();
        student.setStudent_id(1245);
        student.setName("学生1");
        student.setPassword("12345");
        adminService.AddStudentInfo(student);
    }
}