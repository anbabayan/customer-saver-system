package com.task.customer_saver.mapper;

import com.task.customer_saver.dto.CustomerDTO;
import com.task.customer_saver.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public Customer fromCustomerDTO(CustomerDTO customerDTO) {
        if (customerDTO == null) {
            return null;
        }
        return new Customer(
                customerDTO.getName(),
                customerDTO.getCluster(),
                customerDTO.getEmail(),
                customerDTO.getPhone());
    }
}
