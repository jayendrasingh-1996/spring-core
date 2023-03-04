package com.spring.constructor.injection;

public class Address {

	private String street;
	private String city;
	private String state;
	private String pincode;

	public Address() {

	}

	public Address(String street, String city, String state, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
