package com.singleservice.controller;

import com.singleservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: chenkui
 * @Date: 2019/2/19 13:41
 * @Description:
 */
@RequestMapping("/employeeController")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/searchByPage")
    @ResponseBody
    public Map<String, Object> searchPage(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result",employeeService.searcheByPage());
        return result;
    }
}
