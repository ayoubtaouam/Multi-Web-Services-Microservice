# Customer Service Microservice

## Project Overview

This project is a **Customer Service Microservice** designed to handle customer-related operations across multiple web services, including **REST**, **GraphQL**, **gRPC**, and **SOAP**. It allows performing CRUD operations on customer data, offering a variety of communication protocols for integration with other services or clients.

## Technologies Used
- **Spring Boot**: For building the microservice.
- **JPA (Hibernate)**: For interacting with a relational database (MySQL).
- **MySQL**: Used as the database for storing customer information.
- **GraphQL**: To expose customer data with GraphQL API.
- **gRPC**: For high-performance communication between services.
- **SOAP**: For legacy systems or enterprise integration.
- **ModelMapper**: For mapping between DTOs, entities, and gRPC message types.
- **Lombok**: For reducing boilerplate code.

## Microservices Overview

This microservice exposes customer information through the following protocols:

1. **REST API**: For simple HTTP requests.
2. **GraphQL API**: For querying data using GraphQL queries.
3. **gRPC**: For fast, binary-based RPC communication.
4. **SOAP**: For compatibility with legacy SOAP-based systems.

### Microservice Endpoints
1. **REST**:
   - `GET /customers`: Returns a list of all customers.
   - `GET /customers/{id}`: Returns a specific customer by ID.
   - `POST /customers`: Creates a new customer.

2. **GraphQL**:
   - `Query allCustomers`: Retrieves all customers.
   - `Query customerById`: Retrieves a customer by ID.
   - `Mutation saveCustomer`: Saves a new customer.

3. **gRPC**:
   - `getAllCustomers`: Retrieves all customers (uses `GetCustomerResponse`).
   - `getCustomerById`: Retrieves a customer by ID (uses `GetCustomerByIdResponse`).
   - `saveCustomer`: Creates a new customer (uses `SaveCustomerResponse`).

4. **SOAP**:
   - `allCustomers`: Retrieves all customers.
   - `customerById`: Retrieves a customer by ID.
   - `saveCustomer`: Saves a new customer.

## Project Setup

### Prerequisites

1. **Java 21** or higher.
2. **Maven 3.8.1+** for building the project.
3. **MySQL** Database (running locally or remotely).

### Configuration

1. **Database Configuration**: 
   - Ensure MySQL is running and the database `customers_db` is available.
   - Update `application.properties` with the correct database credentials.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/customers_db?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
    ```

2. **SOAP Web Service Configuration**: 
   - The SOAP Web Service is configured in `CXFSoapWebServiceConfig` using Apache CXF.

    ```java
    @Configuration
    @AllArgsConstructor
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
    ```

3. **gRPC Configuration**: 
   - The `CustomerService.proto` defines the gRPC service and messages. The generated code is used to handle customer-related gRPC operations.

4. **GraphQL Schema**: 
   - The GraphQL schema is defined in `schema.graphqls`, and Spring Boot’s GraphQL integration is configured in the project.

### Building the Project

1. Clone the repository and navigate to the project directory.
2. Use Maven to build the project:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

### Accessing the Endpoints

- **REST API**: Access the REST endpoints via `http://localhost:8080/customers`.
- **GraphQL**: Access the GraphQL API at `http://localhost:8080/graphql`.
- **gRPC**: The gRPC service is available on port 50051.
- **SOAP**: The SOAP service is available at `http://localhost:8080/services/CustomerService`.

## Service Communication

- **Inter-service Communication**: This microservice can communicate with other services using REST, GraphQL, gRPC, and SOAP. Each protocol is served by different controllers within the `web` package.
- **Service Discovery**: If required, you can integrate with tools like Eureka or Consul for service discovery (currently not included in this version).

## Database Schema

The **Customer** entity contains the following fields:
- **id**: Long (Primary Key, auto-generated)
- **name**: String (Customer's name)
- **email**: String (Customer's email)

The database is configured to use MySQL, and the `ddl-auto=update` setting ensures that Hibernate will automatically manage database schema updates.

## Dependencies

Here are the main dependencies for the project:

- `spring-boot-starter-data-jpa` for JPA and database interaction.
- `spring-boot-starter-web` for REST API and WebFlux.
- `spring-boot-starter-graphql` for GraphQL support.
- `grpc-stub` and `grpc-protobuf` for gRPC support.
- `cxf-spring-boot-starter-jaxws` for SOAP support.
- `modelmapper` for object mapping.
- `lombok` for reducing boilerplate code.

## Conclusion

This **Customer Service Microservice** provides a comprehensive approach to manage customer data through multiple web services. It supports modern communication protocols such as REST, GraphQL, gRPC, and SOAP, ensuring compatibility with a wide range of clients and systems.
