package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig
{
	
   @Bean
   NewTopic newTopic()
  {
	  return TopicBuilder
			 .name(AppConstant.locationUpdateTopic)
			// .partitions(0)
			// .replicas(5)
			 .build();
  } 
}
