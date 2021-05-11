package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentPoolNamingServerV2Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolNamingServerV2Application.class, args);
	}

}
