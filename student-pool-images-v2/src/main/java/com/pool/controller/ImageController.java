package com.pool.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	@Autowired
	private Environment environment;
	@GetMapping("/images")
	public ResponseEntity<?> images(){
		Map<String, String> images=new LinkedHashMap<>();
		images.put("Shiva", "Shiva.jpg");
		images.put("Shiva1", "Shiva1.jpg");
		images.put("PORT", environment.getProperty("server.port"));
		return new ResponseEntity<>(images, HttpStatus.OK);
	}
}
