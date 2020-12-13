package com.zjy.springbootemps.controller;


import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

    @Autowired
    EmployeeServiceImpl employeeService;
    @GetMapping("/userlist")
    public List<Map<String,Object>> userlist(){
        List<Map<String, Object>> list = employeeService.findAll();
        return list;
    }

}
