package com.multi.customer_service.mapper;

import com.multi.customer_service.DTO.CustomerDTO;
import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.stub.CustomerServiceOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public Customer from(/*CustomerRequest customerRequest,*/ CustomerDTO customerDTO) {
//        customer.setName(customerRequest.name());
//        customer.setEmail(customerRequest.email());
        return modelMapper.map(customerDTO, Customer.class);
    }

    public CustomerServiceOuterClass.Customer fromCustomer(Customer customer) {
        return modelMapper.map(customer, CustomerServiceOuterClass.Customer.Builder.class).build();
    }
    public Customer fromGrpcCustomer(CustomerServiceOuterClass.CustomerRequest customer) {
        return modelMapper.map(customer, Customer.class);
    }
}
