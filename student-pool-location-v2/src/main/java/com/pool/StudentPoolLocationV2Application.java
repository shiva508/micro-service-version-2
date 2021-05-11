package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentPoolLocationV2Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolLocationV2Application.class, args);
	}

}
