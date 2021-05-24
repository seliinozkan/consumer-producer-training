package com.so.med.controller;

import com.so.med.producer.KafkaProducer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KafkaController {

    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void pushMessageToTopic(@RequestParam("message") String message){
          this.producer.pushMessage(message);
    }
}
