package com.multi.customer_service.web;

import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.mapper.CustomerMapper;
import com.multi.customer_service.service.CustomerService;
import com.multi.customer_service.stub.CustomerServiceGrpc;
import com.multi.customer_service.stub.CustomerServiceOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor @GrpcService
public class CustomerGrpcController extends CustomerServiceGrpc.CustomerServiceImplBase {
    private CustomerService customerService;
    private CustomerMapper mapper;

    @Override
    public void getAllCustomers(CustomerServiceOuterClass.GetAllCustomersRequest request, StreamObserver<CustomerServiceOuterClass.GetCustomerResponse> responseObserver) {
        List<Customer> customerList = customerService.customerList();
        // Map each customer to customer grpc
        List<CustomerServiceOuterClass.Customer> grpcCustomers =
                customerList.stream().map(mapper::fromCustomer).toList();

        // Build GetCustomerResponse object
        CustomerServiceOuterClass.GetCustomerResponse customerResponse =
                CustomerServiceOuterClass.GetCustomerResponse.newBuilder()
                        .addAllCustomers(grpcCustomers).build();

        responseObserver.onNext(customerResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getCustomerById(CustomerServiceOuterClass.GetCustomerByIdRequest request, StreamObserver<CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
        Customer customer = customerService.customerById(request.getCustomerId());
        CustomerServiceOuterClass.Customer grpcCustomer = mapper.fromCustomer(customer);

        CustomerServiceOuterClass.GetCustomerByIdResponse customerByIdResponse =
                CustomerServiceOuterClass.GetCustomerByIdResponse.newBuilder()
                        .setCustomer(grpcCustomer)
                        .build();

        responseObserver.onNext(customerByIdResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void saveCustomer(CustomerServiceOuterClass.SaveCustomerRequest request, StreamObserver<CustomerServiceOuterClass.SaveCustomerResponse> responseObserver) {
        Customer customer = mapper.fromGrpcCustomer(request.getCustomer());
        Customer saveCostumer = customerService.saveCostumer(customer);

        CustomerServiceOuterClass.SaveCustomerResponse customerResponse =
                CustomerServiceOuterClass.SaveCustomerResponse.newBuilder()
                        .setCustomer(mapper.fromCustomer(saveCostumer))
                .build();

        responseObserver.onNext(customerResponse);
        responseObserver.onCompleted();
    }
}
