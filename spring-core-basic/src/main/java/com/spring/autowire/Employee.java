package com.spring.autowire;


public class Employee {

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	private String name;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
