package com.zheyong.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import com.zheyong.sfgdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreetings() {
		return greetingService.sayGreeting();
	}
}
