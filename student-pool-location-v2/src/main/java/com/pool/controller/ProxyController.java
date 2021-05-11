package com.pool.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ProxyController {
	private Logger logger=LoggerFactory.getLogger(ProxyController.class);
	@GetMapping("/circutebreakertest")
	//@Retry(name = "cricutebreaker-api",fallbackMethod = "somthingWentWrong")
	@CircuitBreaker(name = "default",fallbackMethod = "somthingWentWrong")
	public String getSampleCircuteBreakerData() {
		logger.info("Circute Break method ","Called");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
		return "Circute Breaker Data";
	}
	
	public String somthingWentWrong(Exception ex) {
		
		return "Something really went wrong";
	}
}
