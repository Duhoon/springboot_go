package com.example.springboot_go.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCodeController {
    @RequestMapping(value = "/commonCode/edit")
    public String ActionMethod(){
        return "/commonCode/edit";
    }

    @RequestMapping(value = "/commonCode/{action}", method = {RequestMethod.GET, RequestMethod.POST})
    /* 이 부분은 맵으로 넘기는 것
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView){

        String viewName = "/commonCode/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("read".equals(action)){
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
    */
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView){
        String viewName = "/commonCode/";
        List<Object> resultList = new ArrayList<Object>();
        Map<String, Object> searchMap = new HashMap<String, Object>();
        if("list".equals(action)){
            viewName = viewName + action;
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("NAME", "Don");
            data01.put("COMMON_CODE_ID", 1);
            data01.put("DESCRIPTION", "Handsome guy");
            resultList.add(data01);
            Map<String, Object> data02 = new HashMap<String, Object>();
            data02.put("NAME", "Ann");
            data02.put("COMMON_CODE_ID", 2);
            data02.put("DESCRIPTION", "Pretty girl");
            resultList.add(data02);
            Map<String, Object> data03 = new HashMap<String, Object>();
            data03.put("NAME", "Chen");
            data03.put("COMMON_CODE_ID", 3);
            data03.put("DESCRIPTION", "Extra guy");
            resultList.add(data03);
            searchMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        modelandView.addObject("searchMap", searchMap);
        return modelandView;
    }

}