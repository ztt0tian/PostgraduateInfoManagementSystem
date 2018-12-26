package com.system.controller;

import com.system.model.*;
import com.system.services.interfaces.*;
import com.system.util.FormatDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private RewardPunishExample example;
    @Autowired
    private IRewardPunishService rewardPunishService;
    @Autowired
    private TermExample termExample;
    @Autowired
    private ITermSerivice termSerivice;
    @Autowired
    private ITutorService tutorService;
    @Autowired
    private TutorExample tutorExample;
    @Autowired
    private SpecialtyExample specialtyExample;
    @Autowired
    private ISpecialtyService specialtyService;
    @Autowired
    private IClassService classService;
    @Autowired
    private ClassExample classExample;
    @Autowired
    private StudentExample studentExample;
    @Autowired
    private IStuCourService stuCourService;
    @Autowired
    private CourseExample courseExample;
    @Autowired
    private ICourseService courseService;
    @RequestMapping(value = "/student_login",method = RequestMethod.POST)
    public String studentLogin(@RequestParam(value = "login_info") Integer student_id, @RequestParam(value = "login_psw") String student_password, HttpSession session, Model model) {
        int login_result = studentService.studentLogin(student_id, student_password);
        if(login_result==1){
            Student login_success_student = studentService.selectStudentByPK(student_id);
            session.setAttribute("login_student",login_success_student);
            return "student/student_index";
        }
        else if(login_result==-1) {
            model.addAttribute("error_msg", "密码错误");
            return "student/error";
        }
        else {
            model.addAttribute("error_msg", "学号不存在");
            return "student/error";
        }
    }
    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.invalidate();
        return "exit";
    }
    @RequestMapping(value = "/{student_id}/myRPrecord")
    public String myRPrecod(@PathVariable Integer student_id, Model model) {
        List<RewardPunishRecord> records = studentService.getAllmyRPrecord(student_id);
        example.clear();
        List<RewardPunish> rpes = rewardPunishService.selectRewardPunishByCondition(example);
        termExample.clear();
        List<Term> terms = termSerivice.selectTermByCondition(termExample);
        model.addAttribute("records", records);
        model.addAttribute("rpes", rpes);
        model.addAttribute("terms", terms);
        return "student/student-rprecords";
    }
    @RequestMapping(value = "/{student_id}/myInfo")
    public String myInfo(@PathVariable Integer student_id, Model model) {
        model.addAttribute("student",studentService.selectStudentByPK(student_id));
        classExample.clear();
        tutorExample.clear();
        specialtyExample.clear();
        model.addAttribute("classes", classService.selectClassesByCondition(classExample));
        model.addAttribute("tutors", tutorService.selectByCondition(tutorExample));
        model.addAttribute("specialties", specialtyService.selectSpecialtyByCondition(specialtyExample));
        return "student/student-myinfo";
    }
    @RequestMapping(value = "/{update_stu_id}/updateStudent", method = RequestMethod.POST)
    public String UpdateStudent(Integer update_stu_id, Integer new_stu_class, Integer new_stu_tutor, Integer new_stu_specialty, String new_stu_name, String new_stu_psw, String new_stu_sex, String new_stu_birthday, String new_stu_phonenumber, String new_stu_address) {
        studentExample.clear();
        Student student = new Student();
        student.setSex(new_stu_sex);
        student.setStudent_id(update_stu_id);
        student.setPassword(new_stu_psw);
        student.setClass_id(new_stu_class);
        student.setAddress(new_stu_address);
        try {
            student.setBirthday(FormatDate.StringToDate(new_stu_birthday));
        } catch (ParseException e) {
            student.setBirthday(null);
        }
        student.setTutor_id(new_stu_tutor);
        student.setSpecialty_id(new_stu_specialty);
        student.setName(new_stu_name);
        student.setPhonenumber(new_stu_phonenumber);
        studentExample.createCriteria().andStudent_idEqualTo(update_stu_id);
        studentService.updateStudentByExampleSelective(student, studentExample);
        return "redirect:myInfo";
    }
    @RequestMapping(value = "/{student_id}/myCourse")
    public String myCourse(@PathVariable Integer student_id, Model model) {
        List<Course> selected_courses = stuCourService.selectAllCourseOfone(student_id);
        List<Integer> selected_courses_ids = new ArrayList<Integer>();
        for (Course c:selected_courses) {
            selected_courses_ids.add(c.getCourse_id());
        }
        model.addAttribute("courses", selected_courses);
        courseExample.clear();
        if(selected_courses_ids.size()!=0) {
            courseExample.createCriteria().andCourse_idNotIn(selected_courses_ids);
        }
        model.addAttribute("unselected_courses", courseService.selectCourseByCondition(courseExample));
        StuCourRKey stuCourRKey = new StuCourRKey();
        stuCourRKey.setStudent_id(student_id);
        model.addAttribute(stuCourRKey);
        return "student/student-mycourses";
    }

    @RequestMapping(value = "//{student_id}/addCourse")
    public String addCourse(StuCourRKey stuCourRKey) {
        if(stuCourRKey.getCourse_id()!=null) {
            stuCourService.insertStuCourRecord(stuCourRKey);
        }
        return  "redirect:myCourse";
    }
}
