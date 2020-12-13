package com.zjy.springbootemps.service;

import com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl;
import com.zjy.springbootemps.dao.EmployeeDaoImpl;
import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    EmployeeDaoImpl employeeDao;
    @Override
    public List<Map<String,Object>> findAll() {
        List<Map<String, Object>> maps = employeeDao.selectAll();
        return maps;
    }

    @Override
    public int getCount() {
       return employeeDao.getCount();
    }

    @Override
    public PageInfo<Employee> findEmployeeByPage(int pageNo, int pageSize) {
        List<Employee> employees = employeeDao.selectEmployeeByPage(pageNo, pageSize);
        int count=employeeDao.getCount();
        return new PageInfo<>(employees,count);
    }
}
