package com.task.customer_saver.kafka.listener;

import com.task.customer_saver.config.KafkaTopicConfig;
import com.task.customer_saver.dto.CustomerDTO;
import com.task.customer_saver.service.CustomerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    private final CustomerService customerService;

    public KafkaListeners(CustomerService customerService) {
        this.customerService = customerService;
    }

    @KafkaListener(topics = KafkaTopicConfig.TOPIC_NAME, groupId = "groupId")
    public void listener(@NonNull CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
    }
}
