package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import net.javaguides.springbootbackend.repository.TaskRepository;
import net.javaguides.springbootbackend.request.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/employeefetch")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping("/employeedata")
    public Employee createEmployee(@RequestBody EmployeeRequest request){
        return employeeRepository.save(request.getEmployee());
    }
}
