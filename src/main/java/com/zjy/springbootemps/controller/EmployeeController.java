package com.zjy.springbootemps.controller;

import com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.service.EmployeeServiceImpl;
import com.zjy.springbootemps.utils.PageInfo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public Map<String, Object> getEmployeeJSON(HttpServletRequest request, HttpServletResponse response) {
        String pageNostr = request.getParameter("pageNo");
        int pageNo = Integer.parseInt(pageNostr);
        String pageSizestr = request.getParameter("pageSize");
        int pageSize = Integer.parseInt(pageSizestr);
        Map map = new HashMap();
        PageInfo<Employee> pageInfo = employeeService.findEmployeeByPage(pageNo, pageSize);
        map.put("code", 0);
        map.put("count", pageInfo.getCount());
        map.put("data", pageInfo.getData());
        map.put("msg", "操作成功");
        return map;
    }

    @GetMapping("/delEmployee")
    public Map<String, Object> delEmployeeJSON(HttpServletRequest request, HttpServletResponse response) {
        String idstr = request.getParameter("id");
        int id = idstr != null ? Integer.parseInt(idstr.trim()) : -1;
        employeeService.remove(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status",200);
        return map;
    }
    @GetMapping("/delEmployees")
    public Map<String, Object> delEmployeesJSON(HttpServletRequest request, HttpServletResponse response) {
        String[] idsStr = request.getParameterValues("id");
        int[] ids=new int[idsStr.length];
        for (int i = 0; i < ids.length; i++) {
           ids[i]=Integer.parseInt(idsStr[i]);
        }
        employeeService.removeEmployees(ids);
        Map<String, Object> map = new HashMap<>();
        map.put("status",200);
        return map;
    }
}