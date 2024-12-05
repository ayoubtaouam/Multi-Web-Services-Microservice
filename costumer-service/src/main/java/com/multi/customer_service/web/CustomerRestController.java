package com.multi.customer_service.web;


import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @AllArgsConstructor
public class CustomerRestController {
    private CustomerService customerService;

    @GetMapping("customers")
    public List<Customer> customerList() {
        return customerService.customerList();
    }

    @GetMapping("customers/{id}")
    public Customer customerById(@PathVariable Long id) {
        return customerService.customerById(id);
    }

    @PostMapping("customers")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCostumer(customer);
    }
}
