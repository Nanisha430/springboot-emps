package com.zjy.springbootemps;

import com.zjy.springbootemps.dao.EmployeeDaoImpl;
import com.zjy.springbootemps.domain.Employee;
import com.zjy.springbootemps.service.EmployeeService;
import com.zjy.springbootemps.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootEmpsApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    EmployeeServiceImpl employeeService;
    @Autowired
    EmployeeDaoImpl employeeDao;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    void Test1(){
        List<Employee> employees = employeeDao.selectEmployeeByPage(2, 5);
        System.out.println(employees);
    }


}
