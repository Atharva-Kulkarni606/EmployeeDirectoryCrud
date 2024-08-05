package com.employee.springboot.employeeCrud.dao;

import com.employee.springboot.employeeCrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImple implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        //Create a query
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);
        //Execute query and get result list
        List<Employee> employees = query.getResultList();
        //Return the list of employees from the db
        return employees;
    }
}
