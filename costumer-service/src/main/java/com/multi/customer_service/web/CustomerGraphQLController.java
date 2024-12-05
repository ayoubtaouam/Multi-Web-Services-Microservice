package com.multi.customer_service.web;

import com.multi.customer_service.DTO.CustomerDTO;
import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.mapper.CustomerMapper;
import com.multi.customer_service.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller @AllArgsConstructor
public class CustomerGraphQLController {
    private CustomerService customerService;
    private CustomerMapper customerMapper;

    @QueryMapping
    public List<Customer> allCustomers() {
        return customerService.customerList();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id) {
        return customerService.customerById(id);
    }

    @MutationMapping
    public Customer saveCustomer(@Argument /*CustomerRequest*/ CustomerDTO customer) {
        Customer c = customerMapper.from(customer);
        return customerService.saveCostumer(c);
    }
}
