package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

	private HelloWorld helloWorld;

	// Constructor Injection
	@Autowired
	public ConstructorInjection(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

	public static void main(String[] args) {

		// Component Scan
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans2.xml");
		ConstructorInjection p = context.getBean(ConstructorInjection.class);
		p.start();

	}

	void start() {
		helloWorld.printHello("SpringDemo4");
	}

}
