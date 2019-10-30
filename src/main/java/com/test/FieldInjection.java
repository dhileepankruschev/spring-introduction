package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {

	// Field Injection
	@Autowired
	private HelloWorld helloWorld;

	public static void main(String[] args) {

		// Component Scan
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans2.xml");
		FieldInjection p = context.getBean(FieldInjection.class);
		p.start();
	}

	void start() {
		helloWorld.printHello("SpringDemo3");
	}

}
