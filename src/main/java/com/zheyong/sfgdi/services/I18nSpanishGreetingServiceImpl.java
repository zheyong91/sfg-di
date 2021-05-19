package com.zheyong.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ESP","default"})
@Service("I18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "hello - ESP profile";
	}
	
}
