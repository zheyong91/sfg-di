package com.zheyong.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zheyong.sfgdi.services.ConstructorGreetingServiceImpl;
import com.zheyong.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import com.zheyong.sfgdi.services.SetterInjectedGreetingServiceImpl;

@Configuration
public class GreetingServiceConfig {
	
	// this can be a way to bring classes that you do not own. i.e. third party libraries classes into spring context
	// i.e. Jackson library
	// name of bean is the name of the method
	@Bean
	ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
		return new ConstructorGreetingServiceImpl();
	}
	
	@Bean
	PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl() {
		return new PropertyInjectedGreetingServiceImpl();
	}
	
	@Bean
	SetterInjectedGreetingServiceImpl setterInjectedGreetingServiceImpl() {
		return new SetterInjectedGreetingServiceImpl();
	}
}
