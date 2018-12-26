package com.system.controller;

import com.system.model.*;
import com.system.model.Class;
import com.system.services.interfaces.*;
import com.system.util.FormatDate;
import com.system.util.StrToTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private RewardPunishExample rewardPunishExample;
    @Autowired
    private IRewardPunishService rewardPunishService;
    @Autowired
    private TermExample termExample;
    @Autowired
    private ITermSerivice termSerivice;
    @Autowired
    private RewardPunishRecordExample rewardPunishRecordExample;
    @Autowired
    private IRewardPunishRecordService rewardPunishRecordService;
    @RequestMapping(value = "/admin_login",method = RequestMethod.POST)
    public String AdminLogin(@RequestParam(value = "login_info") String admin_name, @RequestParam(value = "login_psw") String admin_password, HttpSession session, Model model) {
        int login_result = adminService.adminLogin(admin_name, admin_password);
        System.out.println(login_result);
        if(login_result==1){
            Admin login_admin = adminService.selectAdminByPK(admin_name);
            session.setAttribute("login_admin",login_admin);
            return "redirect:course/showAllCourse";
        }
        else if(login_result==-1) {
            model.addAttribute("error_msg", "管理员密码错误");
            return "admin/error";
        }
        else {
            model.addAttribute("error_msg", "此账号不存在");
            return "admin/error";
        }
    }

    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.invalidate();
        return "exit";
    }
    @RequestMapping(value = "/student/addStudent", method = RequestMethod.POST)
    public String AddStudentInfo(Student student,Model model) {
        try {
            adminService.AddStudentInfo(student);
            return "redirect:showAllStudent";
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "学号已经存在，不能添加");
            return "admin/admin-operate-error";
        }
    }
    @RequestMapping(value = "/student/searchStudent",method = RequestMethod.POST)
    public String SearchStudentByPK(Integer keyword, Model model) { studentExample.clear();
        classExample.clear();
        tutorExample.clear();
        specialtyExample.clear();
        model.addAttribute("classes", classService.selectClassesByCondition(classExample));
        model.addAttribute("tutors", tutorService.selectByCondition(tutorExample));
        model.addAttribute("specialties", specialtyService.selectSpecialtyByCondition(specialtyExample));
        model.addAttribute("searchStudent", studentService.selectStudentByPK(keyword));
        return "admin/search-student-result";
    }
    @RequestMapping(value = "/student/deleteStudent")
    public String DeleteStudent(Integer student_id,Model model) {
        try {
            studentService.deleteStudentByPK(student_id);
            return "redirect:showAllStudent";
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "此学生尚存其他关联关系，暂不能删除");
            return "admin/admin-operate-error";
        }
    }
    @RequestMapping(value = "/student/updateStudent", method = RequestMethod.POST)
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
        return "redirect:showAllStudent";
    }
    @RequestMapping(value = "/student/showAllStudent")
    public String showAllStudent(ModelMap modelMap) {
        studentExample.clear();
        classExample.clear();
        tutorExample.clear();
        specialtyExample.clear();
        modelMap.addAttribute("students", studentService.selectClassesByCondition(studentExample));
        modelMap.addAttribute("classes", classService.selectClassesByCondition(classExample));
        modelMap.addAttribute("tutors", tutorService.selectByCondition(tutorExample));
        modelMap.addAttribute("specialties", specialtyService.selectSpecialtyByCondition(specialtyExample));
        modelMap.addAttribute(new Student());
        return "admin/admin-students";
    }
    @RequestMapping(value = "/class/deleteClass")
    public String DeleteClass(Integer class_id,Model model) {
        try {
            classService.deleteClassByClassId(class_id);
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "此班级尚存其他关联关系，暂不能删除");
            return "admin/admin-operate-error";
        }
        return "redirect:showAllClass";
    }
    @RequestMapping(value = "/class/updateClass", method = RequestMethod.POST)
    public String UpdateClass(Integer update_class_id, String new_class_name, Integer new_class_nums) {
        classExample.clear();
        Class cla = new Class(update_class_id, new_class_name, new_class_nums);
        classExample.createCriteria().andClass_idEqualTo(update_class_id);
        classService.updateByExampleSelective(cla, classExample);
        return "redirect:showAllClass";
    }

    @RequestMapping(value = "/class/addClass")
    public String AddClassInfo(Class cla,Model model) {
        try {
            classService.insertClassSelective(cla);
            return "redirect:showAllClass";
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "已经存在该班级名啦");
            return "admin/admin-operate-error";
        }
    }

    @RequestMapping(value = "/class/showAllClass")
    public String showAllClass(ModelMap modelMap) {
        classExample.clear();
        modelMap.addAttribute("classes", classService.selectClassesByCondition(classExample));
        modelMap.addAttribute(new Class());
        return "admin/admin-classes";
    }

    @RequestMapping(value = "/tutor/showAddTutor")
    public String showAddTutorInfo(Model model) {
        model.addAttribute(new Tutor());
        return "admin/inserTutorInfo";
    }

    @RequestMapping(value = "/tutor/updateTutor", method = RequestMethod.POST)
    public String UpdateTutor(Integer update_tutor_id, String new_tutor_name, String new_tutor_psw) {
        tutorExample.clear();
        Tutor tutor = new Tutor(update_tutor_id, new_tutor_name, new_tutor_psw);
        tutorExample.createCriteria().andTutor_idEqualTo(update_tutor_id);
        tutorService.updateTutorByExampleSelective(tutor, tutorExample);
        return "redirect:showAllTutor";
    }

    @RequestMapping(value = "/tutor/deleteTutor")
    public String DeleteTutor(Integer tutor_id,Model model) {
        try {
            tutorExample.clear();
            tutorExample.createCriteria().andTutor_idEqualTo(tutor_id);
            tutorService.deletTutorByCondition(tutorExample);
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "此导师尚存其他关联关系，暂不能删除");
            return "admin/admin-operate-error";
        }
        return "redirect:showAllTutor";
    }

    @RequestMapping(value = "/tutor/addTutor", method = RequestMethod.POST)
    public String AddTutorInfo(Tutor tutor) {
        tutorService.inserTutor(tutor);
        return "redirect:showAllTutor";
    }

    @RequestMapping(value = "/tutor/showAllTutor")
    public String showAllTutor(ModelMap modelMap) {
        tutorExample.clear();
        modelMap.addAttribute("tutors", tutorService.selectByCondition(tutorExample));
        modelMap.addAttribute(new Tutor());
        return "admin/admin-tutors";
    }

    @RequestMapping(value = "/specialty/showAddSpecialty")
    public String showAddSpecialtyInfo(Model model) {
        model.addAttribute(new Specialty());
        return "admin/inserSpecialtyInfo";
    }

    @RequestMapping(value = "/specialty/deleteSpecialty")
    public String DeleteSpecialty(Integer specialty_id,Model model) {
        try {
            specialtyExample.clear();
            specialtyExample.createCriteria().andSpecialty_idEqualTo(specialty_id);
            specialtyService.deletSpecialtyByCondition(specialtyExample);
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "此专业尚存其他关联关系，暂不能删除");
            return "admin/admin-operate-error";
        }
        return "redirect:showAllSpecialty";
    }

    @RequestMapping(value = "/specialty/updateSpecialty", method = RequestMethod.POST)
    public String UpdateSpecialty(Integer update_specialty_id, String new_specialty_name, String new_specialty_desc) {
        specialtyExample.clear();
        Specialty specialty = new Specialty(update_specialty_id, new_specialty_name, new_specialty_desc);
        specialtyExample.createCriteria().andSpecialty_idEqualTo(update_specialty_id);
        specialtyService.updateSpecialtyByExampleSelective(specialty, specialtyExample);
        return "redirect:showAllSpecialty";
    }

    @RequestMapping(value = "/specialty/addSpecialty", method = RequestMethod.POST)
    public String AddSpecialtyInfo(Specialty specialty) {
        specialtyService.inserSpecialty(specialty);
        return "redirect:showAllSpecialty";
    }

    @RequestMapping(value = "/specialty/showAllSpecialty")
    public String showAllSpecialty(ModelMap modelMap) {
        specialtyExample.clear();
        modelMap.addAttribute("specialties", specialtyService.selectSpecialtyByCondition(specialtyExample));
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

    @RequestMapping(value = "/course/updateCourse", method = RequestMethod.POST)
    public String UpdateCourse(Integer update_course_id, String new_course_name, String new_course_teacher, String new_course_week, String new_course_start, String new_course_end, String new_course_address) throws ParseException {
        courseExample.clear();
        Course course = new Course(update_course_id, new_course_name, new_course_teacher, new_course_week, StrToTime.ConvertStrToTime(new_course_start), StrToTime.ConvertStrToTime(new_course_end), new_course_address);
        courseExample.createCriteria().andCourse_idEqualTo(update_course_id);
        courseService.updateCourseByExampleSelective(course, courseExample);
        return "redirect:showAllCourse";
    }

    @RequestMapping(value = "/course/deleteCourse")
    public String DeleteCourse(Integer course_id,Model model) {
        try {
            courseExample.createCriteria().andCourse_idEqualTo(course_id);
            courseService.deletCourseByCondition(courseExample);
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "此课程尚存其他关联关系，暂不能删除");
            return "admin/admin-operate-error";
        }
        return "redirect:showAllCourse";
    }

    @RequestMapping(value = "/course/searchCourse")
    public String SearchCourseByPK(Integer keyword, Model model) {
        model.addAttribute("searchCourse", courseService.selectCourseByPK(keyword));
        return "admin/search-course-result";
    }
    @RequestMapping(value = "/rpmanage/showAllRP")
    public String showAllRP(ModelMap modelMap) {
        rewardPunishExample.clear();
        modelMap.addAttribute("rpes", rewardPunishService.selectRewardPunishByCondition(rewardPunishExample));
        modelMap.addAttribute(new RewardPunish());
        return "admin/admin-r-p-2";
    }
    @RequestMapping(value = "/rpmanage/addRP")
    public String addRP(RewardPunish rewardPunish) {
        rewardPunishService.insertRP(rewardPunish);
        return "redirect:showAllRP";
    }

    @RequestMapping("/term/showAllTerm")
    public String showAllTerm(ModelMap modelMap) {
        termExample.clear();
        modelMap.addAttribute("terms", termSerivice.selectTermByCondition(termExample));
        modelMap.addAttribute(new Term());
        return "admin/admin-terms";
    }
    @RequestMapping("/term/deleteTerm")
    public String deleteTerm(Integer term_id,Model model) {
        try {
            termSerivice.deleteTermByPK(term_id);
            return "redirect:showAllTerm";
        } catch (Exception e) {
            model.addAttribute("error_operate_msg", "此学期尚存其他关联关系，暂不能删除");
            return "admin/admin-operate-error";
        }
    }
    @RequestMapping(value = "/term/addTerm",method = RequestMethod.POST)
    public String addTerm(Term term) {
        termSerivice.insertTerm(term);
        return "redirect:showAllTerm";
    }
    @RequestMapping(value = "/rprecordmanage/addRPrecord",method = RequestMethod.POST)
    public String addRPrecord(RewardPunishRecord rewardPunishRecord,String rprecord_date) throws ParseException {
        rewardPunishRecord.setRp_record_date(FormatDate.StringToDate(rprecord_date));
        rewardPunishRecordService.insertRPrecord(rewardPunishRecord);
        return "redirect:showAllRPrecord";
    }
    @RequestMapping(value = "/rprecordmanage/showAllRPrecord")
    public String showAllRPrecord(ModelMap modelMap) {
        rewardPunishRecordExample.clear();
        studentExample.clear();
        termExample.clear();
        rewardPunishExample.clear();
        modelMap.addAttribute("RPrecords", rewardPunishRecordService.selectRPrecordByCondition(rewardPunishRecordExample));
        modelMap.addAttribute("students", studentService.selectClassesByCondition(studentExample));
        modelMap.addAttribute("terms", termSerivice.selectTermByCondition(termExample));
        modelMap.addAttribute("rpes", rewardPunishService.selectRewardPunishByCondition(rewardPunishExample));
        modelMap.addAttribute(new RewardPunishRecord());//用于新建奖惩项记录
        return "admin/admin-r-p-1";
    }
    @RequestMapping(value = "/rprecordmanage/deleteRPrecord")
    public String deleteRPrecord(Integer rp_record_id) {
        rewardPunishRecordExample.clear();
        rewardPunishRecordExample.createCriteria().andReward_punish_idEqualTo(rp_record_id);
        rewardPunishRecordService.deletRPrecordByCondition(rewardPunishRecordExample);
        return "redirect:showAllRPrecord";
    }

    @RequestMapping(value = "/rprecordmanage/statistics")
    public String showRPStatistics() {
        return "admin/admin-r-p-statistics";
    }

    @RequestMapping(value = "rprecordmanage/getJsonData", method = RequestMethod.POST)
    @ResponseBody
    public List<JsonDataOfClassRPrecord> getAllClassesRPrecords() {
        List<JsonDataOfClassRPrecord> jsonDataOfClassRPrecords = new ArrayList<JsonDataOfClassRPrecord>();
        classExample.clear();
        List<Class> classes = classService.selectClassesByCondition(classExample);
        List<Integer> rewardPunishes_ids = rewardPunishService.getAllPItemIDs();//奖励ID集
        List<Integer> rewardPunishesmins_ids =rewardPunishService.getAllRItemIDs();//奖励ID集
        for (Class cla:classes) {
            try {
                List<Student> students = studentService.selectStudentsByClassID(cla.getClass_id());//这个班里的所有学生
                List<Integer> stu_ids = new ArrayList<Integer>();
                stu_ids.clear();
                for (Student stu:students
                     ) {
                    stu_ids.add(stu.getStudent_id());
                }
                rewardPunishRecordExample.clear();
                rewardPunishRecordExample.createCriteria().andStudent_idIn(stu_ids).andReward_punish_idIn(rewardPunishes_ids);
                Integer class_P_count = rewardPunishRecordService.selectRPrecordByCondition(rewardPunishRecordExample).size();//班级奖励数
                rewardPunishRecordExample.clear();
                rewardPunishRecordExample.createCriteria().andStudent_idIn(stu_ids).andReward_punish_idIn(rewardPunishesmins_ids);
                Integer class_R_count = rewardPunishRecordService.selectRPrecordByCondition(rewardPunishRecordExample).size();//班级惩罚数
                jsonDataOfClassRPrecords.add(new JsonDataOfClassRPrecord(cla.getClass_name(), class_P_count, class_R_count));
            } catch (Exception e) {
                jsonDataOfClassRPrecords.add(new JsonDataOfClassRPrecord(cla.getClass_name(), 0, 0));
            }
        }
        return jsonDataOfClassRPrecords;
    }

}
