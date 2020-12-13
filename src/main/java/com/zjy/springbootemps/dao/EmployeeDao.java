package com.zjy.springbootemps.dao;

import com.zjy.springbootemps.domain.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeDao {
    public List<Map<String,Object>> selectAll();
    public List<Employee> selectEmployeeByPage(int pageNo,int pageSize);
    public int getCount();
}
