package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to employee page";
    }

    @GetMapping("/add")
    public String Employeeadd(){
        return "Welcome to employee add page";
    }

}
