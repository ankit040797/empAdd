package com.geekster.employeeAdd.repo;

import com.geekster.employeeAdd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpRepo extends JpaRepository<Employee,Long> {
}
