package com.example.springboot_go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BoardController {
    @RequestMapping(value = "/board/list")
    public void ListMethod(){
    }
    @RequestMapping(value = "/board/edit")
    public void EditMethod(){
    }
    @RequestMapping(value = "/board/delete")
    public void DeleteMethod(){
    }
    @RequestMapping(value = "/board/view")
    public void ViewMethod(){
    }
}