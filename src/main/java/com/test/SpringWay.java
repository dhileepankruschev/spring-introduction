package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWay {

	public static void main(String[] args) {

		// Spring Way
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();

	}
}
