package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext contextForEmployee = new ClassPathXmlApplicationContext(
				"com/spring/collection/configForCollection.xml");

		Employee emp = (Employee) contextForEmployee.getBean("emp1");

		System.out.println(emp);
	}

}