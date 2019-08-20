package com.example.springboot_go.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController{
    @RequestMapping(value = "/write")
    public String ActionMethod(){
        return "/organization/input";
    }
    @RequestMapping(value = "/read", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView){
        String viewName = "organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        return modelandView;
    }
}