package com.so.med.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics ="alarm-topic", groupId="alarm-id")
    public void getMessage(String message){
        System.out.println(message);
    }
}
