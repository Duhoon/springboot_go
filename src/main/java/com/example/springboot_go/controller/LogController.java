package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/log")
public class LogController{
    @RequestMapping(value = {"/login", "logout", "signup"})
    public void ActionMethod(){
    }
}