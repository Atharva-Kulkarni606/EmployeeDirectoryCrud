package com.employee.springboot.employeeCrud.dao;


import com.employee.springboot.employeeCrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    //Get all the employees
    List<Employee> findAll();
}
