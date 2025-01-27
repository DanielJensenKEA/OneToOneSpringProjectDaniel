package com.example.onetoonespringprojectdaniel.repository;

import com.example.onetoonespringprojectdaniel.model.Employee;
import org.hibernate.JDBCException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    void testAtLeastOnePoul() {
        List<Employee> list = employeeRepository.findEmployeeByName("poul");
        assertTrue(list.size() > 0);
    }

     @Test
    void testDeleteEmployee() {
        List<Employee> list = employeeRepository.findEmployeeByName("poul");
        Employee empl = list.get(0);
        assertEquals("Poul", empl.getName());
//        userRepository.delete(empl.getUser());
         assertThrows(org.springframework.dao.InvalidDataAccessApiUsageException.class, () -> userRepository.delete(empl.getUser()));
     }

}