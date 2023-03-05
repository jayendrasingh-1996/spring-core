package com.spring.lifecycle.usingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean{

	private int id;
	private double price;
	private String name;

	public Pepsi(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		System.out.println("Setting details using constructor method");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting id using setter method");
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {

		System.out.println("Setting price using setter method");
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name using setter method");
		this.name = name;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		// it will work as init()
		System.out.println("Drinking pepsi");
		
	}

	public void destroy() throws Exception {
		// it will work as destroy()
				System.out.println(" pepsi khatam tata bye bye");
				
	}

}
