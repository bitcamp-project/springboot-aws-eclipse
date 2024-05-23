package com.coeding.springboot.aws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

	@GetMapping("/api/hello")
	public String getHello() {
		return "hello";
	}
	
	
}
