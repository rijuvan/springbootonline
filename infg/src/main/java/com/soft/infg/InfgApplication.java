package com.soft.infg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfgApplication.class, args);
	}
}

@RestController
class SayHello
{
	@RequestMapping("/")
	public String say()
	{
		return "Hello Dear !!";
	}
}
