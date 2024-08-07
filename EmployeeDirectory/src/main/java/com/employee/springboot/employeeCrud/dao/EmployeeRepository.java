package com.employee.springboot.employeeCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.springboot.employeeCrud.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
