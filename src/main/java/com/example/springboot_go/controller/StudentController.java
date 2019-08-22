package com.example.springboot_go.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.springboot_go.controller.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/student/{action}", method= {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView actionMethod(@PathVariable String action, @RequestParam Map<String, Object> paramMap ,ModelAndView modelandView){
        String viewName = "/student/" + action ;
        List<Object> resultList = new ArrayList<Object>();
        resultList = (List) studentService.ActionMethod();
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }
}