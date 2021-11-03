package com.learnit.mq.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerPublisher {

	@GetMapping("/publish")
	public String publishMessage() {
		return "Hello World";
	}
}
