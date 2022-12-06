package com.example.employee_backend.controller;

import com.example.employee_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String Welcomepage() {
        return "Welcome to employee page";
    }

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Employeeadd(@RequestBody Employees e) {
        System.out.println(e.getEmployeecode());
        System.out.println(e.getEmployeename().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "Employee added successfully";
    }
}


