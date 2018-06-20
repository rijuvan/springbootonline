package com.infogain.onlineTraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OnlineTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTrainingApplication.class, args);
	}
}


@RestController
class Welcome {

	@RequestMapping("/hello")
	public String sayHello() {

		return "hello Weclome to the training !!";
	}
}
