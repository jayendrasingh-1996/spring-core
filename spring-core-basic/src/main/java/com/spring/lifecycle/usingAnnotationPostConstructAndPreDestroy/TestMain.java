package com.spring.lifecycle.usingAnnotationPostConstructAndPreDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lifecycle.Samosa;

public class TestMain {

	public static void main(String[] args) {

		// here instead of using ApplicationContext
		// we have to use for making shutdown hook active
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/lifecycle/usingAnnotationPostConstructAndPreDestroy/configLifeCycleAnnotations.xml");
		context.registerShutdownHook();

		Example person = (Example) context.getBean("s1");

		System.out.println(person);

		// registring shut down hook

	}

}
