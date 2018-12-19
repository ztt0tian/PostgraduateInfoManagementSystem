package com.system.controller;

import com.system.model.*;
import com.system.services.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String AddStudentInfo(Student student) {
        adminService.AddStudentInfo(student);
        return "redirect:showAllStudent";
    }
    @RequestMapping("/showAddStudent")
    public String showAddStuInfo(Model model) {
        model.addAttribute(new Student());
        return "admin/inserStudentInfo";
    }
    @RequestMapping(value = "/showAllStudent")
    public String showAllStudent(ModelMap modelMap) {
        studentExample.clear();
        modelMap.addAttribute("students",studentService.selectClassesByCondition(studentExample));
        return "admin/allStudent";
    }

    @RequestMapping(value = "/showAddTutor")
    public String showAddTutorInfo(Model model) {
        model.addAttribute(new Tutor());
        return "admin/inserTutorInfo";
    }
    @RequestMapping(value = "/addTutor",method = RequestMethod.POST)
    public String AddTutorInfo(Tutor tutor) {
        tutorService.inserTutor(tutor);
        return "redirect:showAllTutor";
    }
    @RequestMapping(value = "/showAllTutor")
    public String showAllTutor(ModelMap modelMap) {
        tutorExample.clear();
        modelMap.addAttribute("tutors",tutorService.selectByCondition(tutorExample));
        return "admin/allTutor";
    }

    @RequestMapping(value = "/showAddSpecialty")
    public String showAddSpecialtyInfo(Model model) {
        model.addAttribute(new Specialty());
        return "admin/inserSpecialtyInfo";
    }

    @RequestMapping(value = "/addSpecialty",method = RequestMethod.POST)
    public String AddSpecialtyInfo(Specialty specialty) {
        specialtyService.inserSpecialty(specialty);
        return "redirect:showAllSpecialty";
    }
    @RequestMapping(value = "/showAllSpecialty")
    public String showAllSpecialty(ModelMap modelMap) {
        studentExample.clear();
        modelMap.addAttribute("specialties",specialtyService.selectSpecialtyByCondition(specialtyExample));
        return "admin/allSpecialty";
    }
}
