package com.dailylesson.spring.data.jpa.repository;

import com.dailylesson.spring.data.jpa.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

//    @Test
//    public void saveCustomer(){
//        Customer customer = Customer.builder()
//                .firstName("Mark")
//                .lastName("web")
//                .email("mark@email.com")
//                .address("USA")
//                .build();
//        customerRepository.save(customer);
//    }
}