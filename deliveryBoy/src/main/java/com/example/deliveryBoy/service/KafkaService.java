package com.example.deliveryBoy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.example.deliveryBoy.config.Constants.LOCATION_TOPIC_NAME;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public boolean updateService(String location) {

        kafkaTemplate.send(LOCATION_TOPIC_NAME,location);

        return true;


    }
}
