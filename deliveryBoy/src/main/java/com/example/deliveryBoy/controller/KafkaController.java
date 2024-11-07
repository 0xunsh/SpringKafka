package com.example.deliveryBoy.controller;


import com.example.deliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")

public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<String> updateLocation() {

        for(int i =1; i<100000; i++) {


            kafkaService.updateService("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )");
        i++;
        }

        return ResponseEntity
                .status(HttpStatus.OK)       // Set status code to 200 OK
                .body("Location Updated!");      // Set the response body
    }

}
