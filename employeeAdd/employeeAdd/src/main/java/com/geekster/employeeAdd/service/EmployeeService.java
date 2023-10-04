package com.geekster.employeeAdd.service;

import com.geekster.employeeAdd.model.Employee;
import com.geekster.employeeAdd.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmpRepo iEmpRepo;

    public String save(Employee newEmp) {
        iEmpRepo.save(newEmp);
        return "emp Added";
    }

    public List<Employee> getEmp() {
        return iEmpRepo.findAll();
    }

    public String updateEmp(Long id) {

        Employee add=iEmpRepo.findById(id).get();
        add.setEmpId(Long.valueOf(6));
        iEmpRepo.save(add);
        return "update";
    }

    public String removeEmp(Long id) {
        iEmpRepo.deleteById(id);
        return "removed";
    }
}
