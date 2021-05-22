package com.pool.proxy;

import java.util.Map;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "student-pool-images",url = "localhost:8082")
@FeignClient(name = "student-pool-images",path = "/student-pool-images")
public interface StudentPoolImagesProxy {
	@GetMapping("/images")
	public ResponseEntity<Map> getUserIds(); 
}
