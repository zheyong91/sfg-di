package com.zheyong.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.zheyong.sfgdi.services.ConstructorGreetingServiceImpl;
import com.zheyong.sfgdi.services.PrimaryGreetingServiceImpl;
import com.zheyong.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import com.zheyong.sfgdi.services.SetterInjectedGreetingServiceImpl;
import com.zheyong.sfgdi.services.I18nEnglishGreetingServiceImpl;
import com.zheyong.sfgdi.services.I18nSpanishGreetingServiceImpl;

@Configuration
public class GreetingServiceConfig {

	// this can be a way to bring classes that you do not own. i.e. third party
	// libraries classes into spring context
	// i.e. Jackson library
	// name of bean is the name of the method

	@Primary
	@Bean
	PrimaryGreetingServiceImpl primaryGreetingSerivceImpl() {
		return new PrimaryGreetingServiceImpl();
	}

	@Profile("EN")
	@Bean
	I18nEnglishGreetingServiceImpl I18nService() {
		return new I18nEnglishGreetingServiceImpl();
	}

	@Profile({ "ESP", "default" })
	@Bean("I18nService")
	I18nSpanishGreetingServiceImpl I18nSpanishGreetingServiceImpl() {
		return new I18nSpanishGreetingServiceImpl();
	}

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
