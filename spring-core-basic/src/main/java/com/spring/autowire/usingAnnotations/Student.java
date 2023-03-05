package com.spring.autowire.usingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int studentId;
	private String studentName;

	private Address address;

	public int getStudentId() {

		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {

		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public Student( @Qualifier("address1") Address address) {

		super();

		this.address = address;
		System.out.println("using constructor");
	}

	public void setAddress(Address address) {

		System.out.println("setting address");

		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}

}
