package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/Autowireconfig.xml");

		Employee emp = (Employee) context.getBean("emp");

		System.out.println(emp.getAddress());

		System.out.println("===================");

		System.out.println(emp);

	}
}
