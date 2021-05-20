package com.zheyong.sfgdi.services;

public class SetterInjectedGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "hello world - setter";
	}
	
}
