package com.zheyong.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "hello - EN profile";
	}
	
}
