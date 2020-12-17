package com.zjy.springbootemps.dao;

import com.zjy.springbootemps.domain.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeDao {
    public List<Map<String,Object>> selectAll();
    public List<Employee> selectEmployeeByPage(int pageNo,int pageSize);
    public int getCount();
    public void deleteEmployee(Integer id);

    void insertEmployee(String empno, String ename, String job, Date hiredate, Integer mgr, Double sal, Double comm, Integer deptno);

    void updateEmployee(Integer id, String empno, String ename, String job, Integer mgr, Date hiredate, Double sal, Double comm, Integer deptno);

}
