package com.example.springsecuritydemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    public String getLoginView () {
        return "Login";
    }

    @GetMapping("courses")
    public String getCourses () {
        return "Courses";
    }
}
