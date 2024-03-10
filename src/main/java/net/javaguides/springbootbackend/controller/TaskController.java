package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.model.Task;
import net.javaguides.springbootbackend.repository.TaskRepository;
import net.javaguides.springbootbackend.request.EmployeeRequest;
import net.javaguides.springbootbackend.request.TaskRequest;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    
    @GetMapping("/taskfetch")
    public List<Task> getAllEmployees(){
        return taskRepository.findAll();
    }
    @PostMapping("/taskdata")
    public ResponseEntity createEmployee(@RequestBody TaskRequest request){
        return ResponseEntity.ok(HttpStatus.OK);

    }

}
