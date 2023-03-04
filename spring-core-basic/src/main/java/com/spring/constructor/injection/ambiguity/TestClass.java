package com.spring.constructor.injection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.constructor.injection.Person;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/constructor/injection/ambiguity/configCIAmbiguity.xml");

		Add add = (Add) context.getBean("add");


		System.out.println(add);
		add.doSum();

	}

}
