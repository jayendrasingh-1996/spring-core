package com.spring.pojo;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {

		this.studentName = studentName;
		
		System.out.println("setting student name " + this.studentName);
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
	
}
