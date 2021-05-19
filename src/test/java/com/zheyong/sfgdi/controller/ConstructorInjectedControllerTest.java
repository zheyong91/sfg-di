package com.zheyong.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zheyong.sfgdi.controllers.ConstructorInjectedController;
import com.zheyong.sfgdi.services.ConstructorGreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	ConstructorInjectedController controller;
	
	@BeforeEach
	void setup() {
		controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
