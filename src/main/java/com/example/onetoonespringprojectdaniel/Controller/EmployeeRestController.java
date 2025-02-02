package com.example.onetoonespringprojectdaniel.Controller;

import com.example.onetoonespringprojectdaniel.model.Employee;
import com.example.onetoonespringprojectdaniel.model.User;
import com.example.onetoonespringprojectdaniel.repository.EmployeeRepository;
import com.example.onetoonespringprojectdaniel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/employees")
    public List<Employee> getusers() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee postEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        return employeeRepository.save(employee);
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User postUser(@RequestBody User user) {
        System.out.println(user);
        return userRepository.save(user);
    }
}
