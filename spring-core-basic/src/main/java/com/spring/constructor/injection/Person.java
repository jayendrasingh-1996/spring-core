package com.spring.constructor.injection;

import java.util.List;

public class Person {

	private String name;
	private int personId;

	private List<String> mobileNo;

	private Address address;

	public Person(String name, int personId, Address address, List<String> mobileNo) {
		super();
		this.name = name;
		this.personId = personId;
		this.mobileNo = mobileNo;
		this.address = address;
	
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", mobileNo=" + mobileNo + ", address=" + address
				+ "]";
	}

}
