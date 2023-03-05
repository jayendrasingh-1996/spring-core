package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestMain {

	public static void main(String[] args) {

		//here instead of using ApplicationContext
		//we have to use for making shutdown hook active
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/configLifeCycle.xml");

		Samosa person = (Samosa) context.getBean("s1");

		System.out.println(person);

		//registring  shut down hook
		context.registerShutdownHook();
		
	}

}
