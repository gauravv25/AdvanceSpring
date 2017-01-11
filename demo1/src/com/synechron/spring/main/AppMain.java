package com.synechron.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synechron.spring.bean.HelloWorld;

public class AppMain {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Context loaded....");
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4");
		// output : When Bean is prototype
		// Context loaded....
		// In Constructor...
		// Hello Spring 4
		
		
		//output :  when bean is singlton  (bean loaded before context loading) 
		// To achive as in prototype you can give lazy-init = "true"
		// In Constructor...
		// Context loaded....
		// Hello Spring 4
		context.close();
	}

}
