package com.example.demo;

import com.example.demo.db.repository.EmployeeRepository;
import com.example.demo.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        EmailService emailService = new EmailService();
//        emailService.sendSimpleMessage("6d3e88a88f-2d991c@inbox.mailtrap.io", "Buna ziua", "test mail");
    }

    @Override
    public void run(String... args) throws Exception {
//        employeeRepository.save(new Employee(0,"George", "Muresan3"));
        System.out.println(employeeRepository.mihailov());
    }
}
