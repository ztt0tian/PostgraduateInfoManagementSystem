package com.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/adminclass")
    public String showAdminClass() {
        return "admin/admin-courses";
    }
}
