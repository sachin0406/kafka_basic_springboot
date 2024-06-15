package com.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstant;

@Service
public class KafkaService
{
	private Logger logger = LoggerFactory.getLogger(KafkaService.class);
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	public boolean updateLocation(String location)
	{
		this.kafkaTemplate.send(AppConstant.locationUpdateTopic, location);
		System.out.println("LOCATION :"+ location);
		this.logger.info("message produced");
		return true;
	}

}
