package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentPoolApiGatewayV2Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolApiGatewayV2Application.class, args);
	}

}
