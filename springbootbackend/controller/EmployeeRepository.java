package com.example.springbootbackend.controller;

import com.example.springbootbackend.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    <Employee> Employee save(Employee employee);

    Optional<Object> findById(long id);

    void delete(Employee employee);

    List<Employee> findAll();
}
