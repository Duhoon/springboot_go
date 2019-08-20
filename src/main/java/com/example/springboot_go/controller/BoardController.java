package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
@RequestMapping(value="/board")
public class BoardController {
    @RequestMapping(value = {"/edit", "/delete", "/list", "/view"}, method = {RequestMethod.GET, RequestMethod.POST})
    public void actionMethod(){}
    /*
    @RequestMapping(value = "/list")
    public void ListMethod(){
    }
    @RequestMapping(value = "/edit")
    public void EditMethod(){
    }
    @RequestMapping(value = "/delete")
    public void DeleteMethod(){
    }
    @RequestMapping(value = "/view")
    public void ViewMethod(){
    }
    */
}