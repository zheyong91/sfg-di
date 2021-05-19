package com.zheyong.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zheyong.sfgdi.controllers.PropertyInjectedController;
import com.zheyong.sfgdi.services.ConstructorGreetingServiceImpl;

public class PropertyInjectedControllerTest {
	PropertyInjectedController controller;
	
	@BeforeEach
	void setup() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingServiceImpl();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
