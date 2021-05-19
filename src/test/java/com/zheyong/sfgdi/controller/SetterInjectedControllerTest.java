package com.zheyong.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zheyong.sfgdi.controllers.SetterInjectedController;
import com.zheyong.sfgdi.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {

	private SetterInjectedController controller;
	
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingServiceImpl());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
