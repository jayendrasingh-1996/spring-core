package com.spring.lifecycle.usingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// here instead of using ApplicationContext
		// we have to use for making shutdown hook active

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/lifecycle/usingInterface/configLifeCycle.xml");

		// registring shut down hook
		context.registerShutdownHook();

		Pepsi pepsi = (Pepsi) context.getBean("s1");

		System.out.println(pepsi);

	}

}
