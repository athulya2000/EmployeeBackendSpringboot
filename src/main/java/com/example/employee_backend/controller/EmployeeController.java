package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employees> View() {
        return (List<Employees>) dao.findAll();
    }

   @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Employeeadd(@RequestBody Employees e) {
        System.out.println(e.getEmployeecode());
        System.out.println(e.getEmployeename().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
       HashMap<String,String> map=new HashMap<>();
       map.put("status","success");
       return map;
    }
}


