package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCode{
    @RequestMapping(value = "/edit", method = {RequestMethod.GET, RequestMethod.POST})
    public void edit(){};
}