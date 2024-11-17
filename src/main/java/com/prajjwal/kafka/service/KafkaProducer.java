package com.prajjwal.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.prajjwal.kafka.common.GlobalConstants;
import com.prajjwal.kafka.model.User;

@Service
public class KafkaProducer {

	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String, User> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(User user) {
		log.info("Sending message : {}", user);
		Message<User> message = MessageBuilder.withPayload(user)
				.setHeader(KafkaHeaders.TOPIC, GlobalConstants.KAFKA_TOPIC).build();
		kafkaTemplate.send(message);
	}
}
