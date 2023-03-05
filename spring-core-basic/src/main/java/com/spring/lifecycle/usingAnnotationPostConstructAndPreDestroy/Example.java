package com.spring.lifecycle.usingAnnotationPostConstructAndPreDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private int id;
	private double price;
	private String name;

	public Example(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		System.out.println("setting using constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setting id using setter");
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting id using setter");

		this.price = price;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		System.out.println("setting id using setter");

		this.name = name;
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	@PostConstruct
	public void start() {

		System.out.println("this will work as init() ");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("this will work as destroy() ");
	}

}
