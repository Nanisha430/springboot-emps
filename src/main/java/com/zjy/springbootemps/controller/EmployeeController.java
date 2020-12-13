package com.zjy.springbootemps.controller;

import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.service.EmployeeServiceImpl;
import com.zjy.springbootemps.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;
    @GetMapping("/getEmployee")
    public Map<String,Object> getEmployeeJSON(HttpServletRequest request, HttpServletResponse response){
        String pagestr = request.getParameter("page");
        int page = Integer.parseInt(pagestr);
        String limitstr = request.getParameter("limit");
        int limit=Integer.parseInt(limitstr);

        Map map=new HashMap();
        PageInfo<Employee> pageInfo=employeeService.findEmployeeByPage(page,limit);
        map.put("code",0);
        map.put("count",pageInfo.getCount());
        map.put("data",pageInfo.getData());
        map.put("msg","操作成功");
        return map;
    }

}
