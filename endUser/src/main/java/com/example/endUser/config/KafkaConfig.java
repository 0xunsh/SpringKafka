package com.example.endUser.config;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.logging.Logger;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME, groupId = AppConstants.GROUP_NAME)
    public void ListenKafka(String location) {

        System.out.println(location);

    }
}
