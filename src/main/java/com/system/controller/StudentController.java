package com.system.controller;

import com.system.model.Class;
import com.system.model.Student;
import com.system.model.StudentExample;
import com.system.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @RequestMapping(value = "/showStudentLogin")
    public String showlogin() {
        return "student/student_login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String studentLogin(Integer student_id, String student_password, HttpSession session, Model model) {
        int login_result = studentService.studentLogin(student_id, student_password);
        if(login_result==1){
            Student login_success_student = studentService.selectStudentByPK(student_id);
            session.setAttribute("current_student",login_success_student);
            return "student/student_index";
        }
        else if(login_result==-1) {
            model.addAttribute("error_msg", "密码错误");
            return "student/student_login";
        }
        else {
            model.addAttribute("error_msg", "学号不存在");
            return "/student/student_login";
        }
    }

}
