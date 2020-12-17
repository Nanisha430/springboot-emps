package com.zjy.springbootemps.service;

import com.zjy.springbootemps.dao.EmployeeDaoImpl;
import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    @Override
    public void remove(Integer id) {
        employeeDao.deleteEmployee(id);
    }

    @Override
    public void removeEmployees(int[] ids) {
        if(ids!=null&&ids.length>0){
            for (int i = 0; i < ids.length; i++) {
                int id = ids[i];
                employeeDao.deleteEmployee(id);
            }
        }
    }

    @Override
    public void addEmployee(String empno, String ename, String job, Date hiredate, Integer mgr, Double sal, Double comm, Integer deptno) {
        employeeDao.insertEmployee(empno,ename,job,hiredate,mgr,sal,comm,deptno);
    }

    @Override
    public void changeEmployee(Integer id, String empno, String ename, String job, Integer mgr, Date hiredate, Double sal, Double comm, Integer deptno) {
        employeeDao.updateEmployee(id,empno,ename,job,mgr,hiredate,sal,comm,deptno);
    }
}
