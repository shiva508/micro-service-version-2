package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StudentPoolCloudConfigServiceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolCloudConfigServiceV2Application.class, args);
	}

}
