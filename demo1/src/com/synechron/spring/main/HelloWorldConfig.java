package com.synechron.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.synechron.spring.bean.HelloWorld;

@Configuration
public class HelloWorldConfig {

	@Bean(name = "helloWorldBean")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
