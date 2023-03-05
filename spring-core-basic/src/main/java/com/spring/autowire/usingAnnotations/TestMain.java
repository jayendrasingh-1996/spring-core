package com.spring.autowire.usingAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

//	AutowireconfigForAnnotations.xml

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/autowire/usingAnnotations/AutowireconfigForAnnotations.xml");

		Student emp = (Student) context.getBean("student");

		System.out.println(emp);
	}

}
