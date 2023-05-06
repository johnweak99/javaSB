package com.example.azurespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringApplication {
	@GetMapping("/testing")
	public String message(){
		return "Testing";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringApplication.class, args);
	}

}
