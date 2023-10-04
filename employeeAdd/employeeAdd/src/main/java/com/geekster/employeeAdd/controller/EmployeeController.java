package com.geekster.employeeAdd.controller;

import com.geekster.employeeAdd.model.Employee;
import com.geekster.employeeAdd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("emp")
    public String addEmp(@RequestBody Employee newEmp){
        return employeeService.save(newEmp);
    }

    @GetMapping("emps")
    public List<Employee> getEmp(){
        return employeeService.getEmp();
    }

    @PutMapping("emps/{id}")
    public String addEmp(@PathVariable Long id){
        return employeeService.updateEmp(id);
    }

    @DeleteMapping("employee/{id}")
    public String remove(@PathVariable Long id){
        return employeeService.removeEmp(id);
    }


}
