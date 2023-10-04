package com.geekster.employeeAdd.repo;

import com.geekster.employeeAdd.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
