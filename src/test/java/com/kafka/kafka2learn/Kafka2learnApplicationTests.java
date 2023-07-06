package com.kafka.kafka2learn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Kafka2learnApplicationTests {

	@Autowired
	Notification auNotification;

	@Test
	void contextLoads() {
		for(int i =0;i<1000000; i++) {
			int finalI = i;
			Runnable thread = () -> auNotification.sendMessage((finalI + ""));
			thread.run();
		}
	}

}
