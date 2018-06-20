package com.soft.infg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Onlinetraining2Application {

	public static void main(String[] args) {
		SpringApplication.run(Onlinetraining2Application.class, args);
	}
}

@RestController
class DemoRest {

	@RequestMapping("/show")

	public String sayHello() {
		return "Demorest For All";
	}
}
