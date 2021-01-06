package com.zjy.springbootemps.service;

import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.utils.PageInfo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {
    public List<Map<String,Object>> findAll();
    //public List<Employee> findEmployeeByPage(int pageNo,int pageSize);
    public int getCount();
    public PageInfo<Employee> findEmployeeByPage(int pageNo, int pageSize);
    public void remove(Integer id);

    void removeEmployees(int[] ids);

    void addEmployee(String empno, String ename, String job, Integer dno);

    void changeEmployee(Integer id, String empno, String ename, String job, Integer dno);
}
