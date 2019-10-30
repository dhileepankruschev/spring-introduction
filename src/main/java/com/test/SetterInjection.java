package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {

	private HelloWorld helloWorld;

	// Setter Injection
	@Autowired
	public void setHelloWorld(HelloWorld helloWorld) {
		helloWorld.setName("SpringDemo5");
		this.helloWorld = helloWorld;
	}

	public static void main(String[] args) {

		// Component Scan
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans2.xml");
		SetterInjection p = context.getBean(SetterInjection.class);
		p.start();

	}

	void start() {
		helloWorld.printHello();
	}

}
