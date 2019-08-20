package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LogController{
    @RequestMapping(value = "/log/login")
    public void LoginMethod(){
    }
    @RequestMapping(value = "/log/logout")
    public void LogoutMethod(){
    }
    @RequestMapping(value = "/log/signup")
    public void SignupMethod(){
    }
}