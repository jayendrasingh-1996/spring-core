package com.spring.refrence;

import java.util.List;

public class Employee {

	private String name;
	private List<PastEmployment> employmentHistory;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PastEmployment> getEmploymentHistory() {
		return employmentHistory;
	}

	public void setEmploymentHistory(List<PastEmployment> employmentHistory) {
		this.employmentHistory = employmentHistory;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(String name, List<PastEmployment> employmentHistory, Address address) {
		super();
		this.name = name;
		this.employmentHistory = employmentHistory;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employmentHistory=" + employmentHistory + ", address=" + address + "]";
	}

}
