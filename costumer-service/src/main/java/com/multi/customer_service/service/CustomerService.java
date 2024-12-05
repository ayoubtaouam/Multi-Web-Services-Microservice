package com.multi.customer_service.service;

import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<Customer> customerList() {
        return customerRepository.findAll();
    }

    public Customer customerById(Long id) {
        return customerRepository.findById(id).get();
    }

    public Customer saveCostumer(Customer customer) {
        return customerRepository.save(customer);
    }
}
