package com.task.customer_saver.controller;

import com.task.customer_saver.config.KafkaTopicConfig;
import com.task.customer_saver.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.lang.NonNull;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class CustomerSaverController {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @PostMapping("/save-customer")
    public void publish(@RequestBody @NonNull CustomerDTO customerDTO) {
        final Message<CustomerDTO> message = MessageBuilder
                .withPayload(customerDTO)
                .setHeader(KafkaHeaders.TOPIC, KafkaTopicConfig.TOPIC_NAME)
                .build();
        template.send(message);
    }
}
