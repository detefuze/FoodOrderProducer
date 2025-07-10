package com.ru.klimashd.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaProducerConfiguration {
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name("food.order.topic")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
