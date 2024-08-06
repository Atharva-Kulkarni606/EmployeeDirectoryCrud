package com.employee.springboot.employeeCrud.dao;


import com.employee.springboot.employeeCrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    //Get all the employees
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
