package com.zjy.springbootemps.controller;

import com.zjy.springbootemps.dao.EmployeeDaoImpl;
import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.service.EmployeeServiceImpl;
import com.zjy.springbootemps.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SelectConteolle {


    @GetMapping("/selectEmps")
    public String select(){
        return "/empsManage/selectEmps";
    }



}
