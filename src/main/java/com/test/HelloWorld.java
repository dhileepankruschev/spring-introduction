package com.test;

import org.springframework.stereotype.Component;

@Component
// @Controller - For Controller layers
// @Service - For Service layers
// @Repository - For DAO layers
public class HelloWorld {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Welcome to " + name);
	}

	public void printHello(String name) {
		System.out.println("Welcome to " + name);
	}
}
