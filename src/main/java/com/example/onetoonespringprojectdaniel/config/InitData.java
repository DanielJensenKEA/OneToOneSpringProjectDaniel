package com.example.onetoonespringprojectdaniel.config;

import com.example.onetoonespringprojectdaniel.model.Employee;
import com.example.onetoonespringprojectdaniel.model.Gender;
import com.example.onetoonespringprojectdaniel.model.User;
import com.example.onetoonespringprojectdaniel.repository.EmployeeRepository;
import com.example.onetoonespringprojectdaniel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        User us1 = new User();
        us1.setEmail("random@aol.com");
        us1.setPassword("sdffasdg");
        userRepository.save(us1);

        Employee empl = new Employee();
        empl.setBorn(LocalDateTime.of(1990, 5, 5, 16, 10, 12));
        empl.setName("Jens");
        empl.setGender(Gender.MALE);
        empl.setVegetarian(true);
        empl.setUser(us1);
        employeeRepository.save(empl);

        us1.setUserID(0);
        us1.setEmail("random2@aol.com");
        us1.setPassword("2");
        userRepository.save(us1);

        empl.setId(0);
        empl.setBorn(LocalDateTime.of(1995, 10, 10, 12, 12, 12));
        empl.setName("Poul");
        empl.setGender(Gender.OTHER);
        empl.setVegetarian(false);
        empl.setUser(us1);
        employeeRepository.save(empl);

        us1.setUserID(0);
        us1.setEmail("random3@aol.com");
        us1.setPassword("sdffasdg3");
        userRepository.save(us1);

        empl.setId(0);
        empl.setBorn(LocalDateTime.of(2005, 10, 10, 12, 12, 12));
        empl.setName("Poul-Erik");
        empl.setGender(Gender.MALE);
        empl.setVegetarian(false);
        empl.setUser(us1);
        employeeRepository.save(empl);

    }
}
