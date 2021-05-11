package com.pool.proxy;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "student-pool-images",url = "localhost:8082")
@FeignClient(name = "student-pool-images")
public interface StudentPoolImagesProxy {
	@GetMapping("/student-pool-images/images")
	public ResponseEntity<Map> getUserIds(); 
}
