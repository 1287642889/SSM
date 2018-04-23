package com.wzf.controller;

import com.wzf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudentById")
    public ModelAndView getStudentById(int id){
        System.out.println("id = "+id);
        ModelAndView mv = new ModelAndView("studentShow");
        mv.addObject("student",studentService.getStudentById(id));
        return mv;
    }
}
