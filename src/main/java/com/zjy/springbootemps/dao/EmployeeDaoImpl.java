package com.zjy.springbootemps.dao;

import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Map<String,Object>> selectAll() {
        String sql="select * from employee";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }


    @Override
    public List<Employee> selectEmployeeByPage(int pageNo, int pageSize) {
        String sql="select * from employee limit ?,?";
        List<Employee> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class),(pageNo-1)*pageSize, pageSize);
        return list;
    }

    @Override
    public int getCount() {
        String sql = "select count(id) from employee";
        List<Integer> count = jdbcTemplate.queryForList(sql, Integer.class);
        return count.get(0);
    }
}
