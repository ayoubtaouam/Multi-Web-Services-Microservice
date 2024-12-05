package com.multi.customer_service.web;

import com.multi.customer_service.service.CustomerService;
import com.multi.customer_service.DTO.CustomerDTO;
import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.mapper.CustomerMapper;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component @AllArgsConstructor
@WebService(serviceName = "CustomerWS")
public class CustomerSOAPController {
    private CustomerService customerService;
    private CustomerMapper customerMapper;

    @WebMethod
    public List<Customer> allCustomers() {
        return customerService.customerList();
    }

    @WebMethod
    public Customer customerById(@WebParam(name = "id") Long id) {
        return customerService.customerById(id);
    }

    @WebMethod
    public Customer saveCustomer(@WebParam(name = "customer") CustomerDTO customer) {
        Customer c = customerMapper.from(customer);
        return customerService.saveCostumer(c);
    }
}
