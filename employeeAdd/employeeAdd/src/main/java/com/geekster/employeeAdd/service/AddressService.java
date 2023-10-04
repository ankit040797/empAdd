package com.geekster.employeeAdd.service;

import com.geekster.employeeAdd.model.Address;
import com.geekster.employeeAdd.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address newAddress) {
        iAddressRepo.save(newAddress);
        return "added";
    }

    public List<Address> getAddress() {
        return iAddressRepo.findAll();
    }

    public List<Address> getAddressById(Long id) {
        return (List<Address>) iAddressRepo.findById(id).orElseThrow();
    }

    public String updateAddress(Long id) {
        Address add=iAddressRepo.findById(id).get();
        add.setAddressStreet("RKPURAM");
        iAddressRepo.save(add);
        return "updated";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "removed";
    }
}
