package com.multi.customer_service.configurations;

import com.multi.customer_service.web.CustomerSOAPController;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration @AllArgsConstructor
public class CXFSoapWebServiceConfig {
    private Bus bus;
    private CustomerSOAPController soapController;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, soapController);
        endpoint.publish("/CustomerService");
        return endpoint;
    }
}
