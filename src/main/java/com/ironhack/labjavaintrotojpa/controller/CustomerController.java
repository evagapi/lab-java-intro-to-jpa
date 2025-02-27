package com.ironhack.labjavaintrotojpa.controller;

import com.ironhack.labjavaintrotojpa.model.Customer;
import com.ironhack.labjavaintrotojpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customers")
    public Customer addNewCustomer(@RequestBody Customer customer) {
        return customerService.addNewCustomer(customer);
    }
}
