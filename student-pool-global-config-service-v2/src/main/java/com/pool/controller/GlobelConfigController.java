package com.pool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pool.model.GlobelConfigModel;
import com.pool.model.StudentPoolConfig;

@RestController
public class GlobelConfigController {
	
	@Autowired
	private StudentPoolConfig studentPoolConfig;

	@GetMapping("/config")
	public ResponseEntity<?> getGlobalConfigController() {
		return new ResponseEntity<>(new GlobelConfigModel().setStudentName(studentPoolConfig.getStudentName()).setStudentRollNumber(studentPoolConfig.getStudentRollNumber()),
				HttpStatus.OK);
	}

	
	@GetMapping("/tolarance")
	public ResponseEntity<?> tolarance() {
		throw new RuntimeException("Something really");
	}
	
	public ResponseEntity<?> defaultConfigData() {
		return new ResponseEntity<>(new GlobelConfigModel().setStudentName("We").setStudentRollNumber("Miss"),
				HttpStatus.OK);
	}
}
