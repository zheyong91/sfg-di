package com.zheyong.sfgdi.services;

public class PropertyInjectedGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "hello world - property";
	}
	
}
