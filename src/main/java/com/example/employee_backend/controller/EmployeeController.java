package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String Welcomepage(){
        return "Welcome to employee page";
    }

    @PostMapping("/add")
    public String Employeeadd(){
        return "Welcome to employee add page";
    }

    @PostMapping("/edit")
    public String Editpage(){
        return "Welcome to employee edit page";
    }

    @GetMapping("/view")
    public String Viewpage(){
        return "Welcome to employee view page";
    }

    @PostMapping("/delete")
    public String Deletepage(){
        return "Welcome to employee delete page";
    }

}
