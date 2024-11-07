package com.example.deliveryBoy.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.example.deliveryBoy.config.Constants.LOCATION_TOPIC_NAME;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic createTopic() {
        return TopicBuilder
                .name(LOCATION_TOPIC_NAME)
//                .partitions()
//                .replicas()
                .build();
    }
}
