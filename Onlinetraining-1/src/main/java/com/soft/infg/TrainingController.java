package com.soft.infg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello All!!";
	}
}
