package com.coeding.springboot.aws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coeding.springboot.aws.dto.HelloResponseDto;

@RestController
public class HelloApiController {

	@GetMapping("/api/hello")
	public String getHello() {
		return "hello";
	}
	
	@GetMapping("/api/hello/dto")
	public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("count") int count) {
		return new HelloResponseDto(name, count);
		// goto unit test
	}
	
}
