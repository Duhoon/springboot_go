package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController{
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read(OrganizationBean paramMap, ModelAndView modelandView){
        String viewName = "/organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        return modelandView;
    }
}