package com.example.springboot_go.controller.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    public Object getObject(Object dataMap){
    Map<String, Object> resultObject = new HashMap<String, Object>();
    resultObject.put("MEMBER_ID" , "201521396");
    resultObject.put("NAME" , "KANGDUHOON");
    return resultObject;
    }
}