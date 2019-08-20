package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BoardController {
    @RequestMapping(value = "/list")
    public String ListMethod(){
        return "list";
    }
    @RequestMapping(value = "/edit")
    public void EditMethod(){
    }
    @RequestMapping(value = "/delete")
    public String DeleteMethod(){
        return "delete";
    }
    @RequestMapping(value = "/view")
    public String ViewMethod(){
        return "view";
    }
}