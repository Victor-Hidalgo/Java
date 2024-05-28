package com.hidalgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecondApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Hellooooo", "Vex!");
	}

}
