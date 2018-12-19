package com.system.controller;

import com.system.model.Class;
import com.system.model.ClassExample;
import com.system.services.interfaces.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private IClassService classService;
    @Autowired
    private ClassExample classExample;
    @RequestMapping(value = "/newClass",method = RequestMethod.POST)
    public String createClass(Class cla) {
        classService.insertClassSelective(cla);
        return "redirect:showAllClass";
    }
    @RequestMapping(value = "/showNewClass")
    public String showCreateClass(Model model) {
        model.addAttribute(new Class());
        return "class/NewClass";
    }
    @RequestMapping(value = "/showAllClass")
    public String showAllClass(ModelMap modelMap) {
        classExample.clear();
        modelMap.addAttribute("classes", classService.selectClassesByCondition(classExample));
        return "class/allClass";
    }

    @RequestMapping(value = "/classInfo/{class_id}",method = RequestMethod.GET)
    public String getOneClassInfo(Model model, @PathVariable("class_id") Integer class_id) {
        model.addAttribute("theClass", classService.selectClassByPrimaryKey(class_id));
        return "class/theclass";
    }
}
