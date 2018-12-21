package com.system.controller;

import com.system.model.*;
import com.system.services.interfaces.*;
import com.system.util.StrToTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;
    @Autowired
    private IClassService classService;
    @Autowired
    private ClassExample classExample;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private StudentExample studentExample;
    @Autowired
    private ITutorService tutorService;
    @Autowired
    private TutorExample tutorExample;
    @Autowired
    private SpecialtyExample specialtyExample;
    @Autowired
    private ISpecialtyService specialtyService;
    @Autowired
    private CourseExample courseExample;
    @Autowired
    private ICourseService courseService;
    @RequestMapping(value = "/student/addStudent",method = RequestMethod.POST)
    public String AddStudentInfo(Student student) {
        adminService.AddStudentInfo(student);
        return "redirect:showAllStudent";
    }
    @RequestMapping("/student/showAddStudent")
    public String showAddStuInfo(Model model) {
        model.addAttribute(new Student());
        classExample.clear();
        model.addAttribute("classes", classService.selectClassesByCondition(classExample));
        return "admin/inserStudentInfo";
    }
    @RequestMapping(value = "/student/showAllStudent")
    public String showAllStudent(ModelMap modelMap) {
        studentExample.clear();
        modelMap.addAttribute("students",studentService.selectClassesByCondition(studentExample));
        return "admin/allStudent";
    }

    @RequestMapping(value = "/tutor/showAddTutor")
    public String showAddTutorInfo(Model model) {
        model.addAttribute(new Tutor());
        return "admin/inserTutorInfo";
    }
    @RequestMapping(value = "/tutor/addTutor",method = RequestMethod.POST)
    public String AddTutorInfo(Tutor tutor) {
        tutorService.inserTutor(tutor);
        return "redirect:showAllTutor";
    }
    @RequestMapping(value = "/tutor/showAllTutor")
    public String showAllTutor(ModelMap modelMap) {
        tutorExample.clear();
        modelMap.addAttribute("tutors",tutorService.selectByCondition(tutorExample));
        return "admin/allTutor";
    }

    @RequestMapping(value = "/specialty/showAddSpecialty")
    public String showAddSpecialtyInfo(Model model) {
        model.addAttribute(new Specialty());
        return "admin/inserSpecialtyInfo";
    }

    @RequestMapping(value = "/specialty/deleteSpecialty")
    public String DeleteSpecialty(Integer specialty_id) {
        specialtyExample.clear();
        specialtyExample.createCriteria().andSpecialty_idEqualTo(specialty_id);
        specialtyService.deletSpecialtyByCondition(specialtyExample);
        return "redirect:showAllSpecialty";
    }
    @RequestMapping(value = "/specialty/updateSpecialty",method = RequestMethod.POST)
    public String UpdateSpecialty(Integer update_specialty_id,String new_specialty_name,String new_specialty_desc) {
        specialtyExample.clear();
        Specialty specialty = new Specialty(update_specialty_id, new_specialty_name, new_specialty_desc);
        specialtyExample.createCriteria().andSpecialty_idEqualTo(update_specialty_id);
        specialtyService.updateSpecialtyByExampleSelective(specialty, specialtyExample);
        return "redirect:showAllSpecialty";
    }
    @RequestMapping(value = "/specialty/addSpecialty",method = RequestMethod.POST)
    public String AddSpecialtyInfo(Specialty specialty) {
        specialtyService.inserSpecialty(specialty);
        return "redirect:showAllSpecialty";
    }
    @RequestMapping(value = "/specialty/showAllSpecialty")
    public String showAllSpecialty(ModelMap modelMap) {
        specialtyExample.clear();
        modelMap.addAttribute("specialties",specialtyService.selectSpecialtyByCondition(specialtyExample));
        modelMap.addAttribute(new Specialty());
        return "admin/admin-specialties";
    }
    @RequestMapping(value = "/course/showAddCourse")
    public String showAddCourseInfo(Model model) {
        model.addAttribute(new Course());
        return "admin/insertCourseInfo";
    }
    @RequestMapping(value = "/course/showAllCourse")
    public String showAllCourse(ModelMap modelMap) {
        courseExample.clear();
        modelMap.addAttribute("courses", courseService.selectCourseByCondition(courseExample));
        modelMap.addAttribute(new Course());
        return "admin/admin-courses";
    }

    @RequestMapping(value = "/course/addCourse")
    public String AddCourseInfo(Course course, HttpServletRequest request) throws ParseException {
        course.setCourse_start_time(StrToTime.ConvertStrToTime(request.getParameter("start_time")));
        course.setCourse_end_time(StrToTime.ConvertStrToTime(request.getParameter("end_time")));
        courseService.insertCourse(course);
        return "redirect:showAllCourse";
    }

    @RequestMapping(value = "/course/updateCourse",method = RequestMethod.POST)
    public String UpdateCourse(Integer update_course_id,String new_course_name, String new_course_teacher, String new_course_week, String new_course_start, String new_course_end, String new_course_address) throws ParseException {
        courseExample.clear();
        Course course = new Course(update_course_id, new_course_name,new_course_teacher,new_course_week, StrToTime.ConvertStrToTime(new_course_start), StrToTime.ConvertStrToTime(new_course_end), new_course_address);
        courseExample.createCriteria().andCourse_idEqualTo(update_course_id);
        courseService.updateCourseByExampleSelective(course, courseExample);
        return "redirect:showAllCourse";
    }
    @RequestMapping(value = "/course/deleteCourse")
    public String DeleteCourse(Integer course_id) {
        courseExample.createCriteria().andCourse_idEqualTo(course_id);
        courseService.deletCourseByCondition(courseExample);
        return "redirect:showAllCourse";
    }
    @RequestMapping(value = "/course/searchCourse")
    public String SearchCourseByPK(Integer keyword, Model model) {
        model.addAttribute("searchCourse", courseService.selectCourseByPK(keyword));
        return "admin/search-course-result";
    }
}
