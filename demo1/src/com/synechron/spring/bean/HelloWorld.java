package com.synechron.spring.bean;

import org.springframework.context.annotation.Scope;

@Scope(scopeName="prototype")
public class HelloWorld {

	public HelloWorld() {
		System.out.println("In Constructor...");
	}

	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}