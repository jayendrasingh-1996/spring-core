package com.spring.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/refrence/configForRefrence.xml");

		Employee emp = (Employee) context.getBean("employee1");

		System.out.println(emp.getAddress());

		System.out.println("===================");
		System.out.println(emp.getEmploymentHistory());
		System.out.println("===================");

		System.out.println(emp);

	}
}
