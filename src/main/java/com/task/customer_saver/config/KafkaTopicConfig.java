package com.task.customer_saver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public static final String TOPIC_NAME = "save-customer-topic";

    @Bean
    public NewTopic taskTopic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }
}
