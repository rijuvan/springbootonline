package com.soft.infg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(@RequestParam(value="name") String name)
	{
		
		return "Welcome to Infogain Training !!" + " " + name;
	}
}
