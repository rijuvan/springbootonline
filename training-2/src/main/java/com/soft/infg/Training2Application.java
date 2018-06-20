package com.soft.infg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Training2Application {

	public static void main(String[] args) {
		SpringApplication.run(Training2Application.class, args);
	}
}

@RestController
class HelloWorld {
	@RequestMapping("/")
	public String show() {
		return "Hello";
	}
}