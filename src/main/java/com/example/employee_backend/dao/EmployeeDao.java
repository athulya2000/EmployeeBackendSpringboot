package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {
    @Query(value="SELECT `id`, `companyname`, `designation`, `employeecode`, `employeename`, `mobileno`, `password`, `salary`, `username` FROM `employee` WHERE `employeecode`=:employeecode",nativeQuery = true)
    List<Employees> SearchEmployee(@Param("employeecode") Integer employeecode);
}
