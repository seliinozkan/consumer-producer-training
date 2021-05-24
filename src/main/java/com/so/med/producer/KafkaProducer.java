package com.so.med.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC ="alarm-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void pushMessage(String message){
        this.kafkaTemplate.send(TOPIC, message);
    }

}
