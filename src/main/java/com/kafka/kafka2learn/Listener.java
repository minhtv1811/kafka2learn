package com.kafka.kafka2learn;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Listener {
    @KafkaListener(topics = "testTopic", groupId = "1")
    public void listen(@Payload String streamInfo) {
        System.out.println("Message: " + streamInfo);
    }
}
