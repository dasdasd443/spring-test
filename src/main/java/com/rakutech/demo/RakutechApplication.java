package com.rakutech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutechApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutechApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "Hello WOrld";
	}
}
