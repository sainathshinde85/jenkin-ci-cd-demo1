package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinCicdDemoApplication {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name){
		return "Hello " + name + " You can do it !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinCicdDemoApplication.class, args);
	}

}
