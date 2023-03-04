package com.spring.refrence;

public class PastEmployment {

	private String companyName;
	private String salary;
	private Address address;

	@Override
	public String toString() {
		return "PastEmployment [companyName=" + companyName + ", salary=" + salary + ", address=" + address + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PastEmployment(String companyName, String salary, Address address) {
		super();
		this.companyName = companyName;
		this.salary = salary;
		this.address = address;
	}

	public PastEmployment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
