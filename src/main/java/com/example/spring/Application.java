package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	@SpringBootApplication
	public class Application {
		@GetMapping("/")
	
		public String welcome()
		{
			return "hello spring boot";
		}
	
		@GetMapping("/{input}")
		
		public String test(@PathVariable String input)
		{
			return "hi"+ input+"!!!!";
		}
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}
	

}
