package com.example.springboot_go.controller.service;

import com.example.springboot_go.controller.dao.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService{
    /*
    public Object getObject(Object dataMap){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("NAME", "DUHOON");
        return resultObject;
    }
    */
    @Autowired
    private MemberDao dao;
    public Object getObject(Object dataMap){
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}