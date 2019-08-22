package com.example.springboot_go.controller.service;

import java.util.ArrayList;
import java.util.List;

import com.example.springboot_go.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public Object ActionMethod(){
        List<Object> resultList = new ArrayList<Object>();
        resultList = (List) repository.findAll();
        return resultList;
    }
}