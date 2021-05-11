package com.pool.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pool.proxy.StudentPoolImagesProxy;

@RestController
public class LocationController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private StudentPoolImagesProxy studentPoolImagesProxy;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/locationimages")
	public ResponseEntity<?> images(){
		ResponseEntity<Map> map=restTemplate.getForEntity("http://localhost:8082/student-pool-images/images", Map.class);
		Map<String, String> images=new LinkedHashMap<>();
		images.put("Location", "Thalla Malka puram");
		images.putAll(map.getBody());
		return new ResponseEntity<>(images, HttpStatus.OK);
	}
	
	@GetMapping("/locationimagesFeign")
	public ResponseEntity<?> imagesFeign(){
		ResponseEntity<Map> map=studentPoolImagesProxy.getUserIds();
		Map<String, String> images=new LinkedHashMap<>();
		images.put("Location", "Thalla Malka puram Feign");
		images.putAll(map.getBody());
		return new ResponseEntity<>(images, HttpStatus.OK);
	}
}
