package com.pool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@Configuration
public class ApiGatewayConfiguration {
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
						.filters(f -> f.addRequestHeader("MyHeader", "MyURI")
									   .addRequestParameter("Param", "MyValue"))
						.uri("http://httpbin.org:80"))
				.route(p -> p.path("/student-pool-images/**").uri("lb://student-pool-images"))
				.route(p -> p.path("/student-pool-location/**").uri("lb://student-pool-location"))
				.route(p -> p.path("/student-pool-location-feign/**").uri("lb://student-pool-location"))
				.route(p->p.path("/student-pool-location-new/**")
						   .filters(f->f.rewritePath("/student-pool-location-new/(?<segment>.*)", 
								                     "/student-pool-location-feign/${segment}"))
						   .uri("lb://student-pool-location"))
				.build();
	}
}
