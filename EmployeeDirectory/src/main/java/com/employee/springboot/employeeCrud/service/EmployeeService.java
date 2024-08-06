package com.employee.springboot.employeeCrud.service;

import com.employee.springboot.employeeCrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
