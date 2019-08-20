package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LogController{
    @RequestMapping(value = "/login")
    public String LoginMethod(){
        return "login";
    }
    @RequestMapping(value = "/logout")
    public String LogoutMethod(){
        return "logout";
    }
    @RequestMapping(value = "/signup")
    public String SignupMethod(){
        return "signup";
    }
}