package com.zheyong.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zheyong.sfgdi.controllers.ConstructorInjectedController;
import com.zheyong.sfgdi.controllers.I18nController;
import com.zheyong.sfgdi.controllers.MyController;
import com.zheyong.sfgdi.controllers.PropertyInjectedController;
import com.zheyong.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		System.out.println("profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());
		
		System.out.println("primary");
		System.out.println(myController.getGreetings());
		
		System.out.println("property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
