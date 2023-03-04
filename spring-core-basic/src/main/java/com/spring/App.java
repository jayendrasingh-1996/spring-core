package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.Employee;
import com.spring.pojo.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student bean = (Student) context.getBean("student1");

		System.out.println(bean);

	}
}
