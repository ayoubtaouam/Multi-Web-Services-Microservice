package com.multi.customer_service;

import com.multi.customer_service.entities.Customer;
import com.multi.customer_service.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CostumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerServiceApplication.class, args);
	}

	//@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder()
							.name("Potato")
							.email("potato@gee.com")
							.build());
			customerRepository.save(Customer.builder()
					.name("Gang")
					.email("gang@gee.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Goomar")
					.email("goomar@gee.com")
					.build());
		};
	}

}
