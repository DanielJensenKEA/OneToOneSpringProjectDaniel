package com.example.onetoonespringprojectdaniel.Controller;

import com.example.onetoonespringprojectdaniel.model.Employee;
import com.example.onetoonespringprojectdaniel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getusers() {
        return employeeRepository.findAll();
    }
}
