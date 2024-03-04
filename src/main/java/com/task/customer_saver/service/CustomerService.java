package com.task.customer_saver.service;

import com.task.customer_saver.dto.CustomerDTO;
import com.task.customer_saver.mapper.CustomerMapper;
import com.task.customer_saver.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public void saveCustomer(CustomerDTO customerDTO) {
        if (customerDTO == null) {
            return;
        }
        customerRepository.save(customerMapper.fromCustomerDTO(customerDTO));
    }
}
