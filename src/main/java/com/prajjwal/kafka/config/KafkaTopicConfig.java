package com.prajjwal.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.prajjwal.kafka.common.GlobalConstants;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic newTopic() {
		return TopicBuilder.name(GlobalConstants.KAFKA_TOPIC).build();
	}
}
