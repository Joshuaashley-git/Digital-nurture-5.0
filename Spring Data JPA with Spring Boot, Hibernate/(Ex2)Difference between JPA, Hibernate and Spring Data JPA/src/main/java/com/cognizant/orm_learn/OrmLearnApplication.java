package com.cognizant.orm_learn;

import com.cognizant.orm_learn.entity.Employee;
import com.cognizant.orm_learn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Employee employee = new Employee("Ashley", 75000.0);
        Employee saved = employeeService.addEmployee(employee);
        System.out.println("Saved via Spring Data JPA: " + saved);
    }
}