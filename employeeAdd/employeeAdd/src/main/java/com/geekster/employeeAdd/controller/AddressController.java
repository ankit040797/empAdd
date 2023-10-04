package com.geekster.employeeAdd.controller;

import com.geekster.employeeAdd.model.Address;
import com.geekster.employeeAdd.service.AddressService;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }

    @GetMapping("addresses")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }

    @PutMapping("address/{id}")
    public String updateAddress(@PathVariable Long id){
        return addressService.updateAddress(id);
    }

    @DeleteMapping("address/{id}")
    public String removedAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }

}
