package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private List<String> phones;
	private Set<String> address;
 	private Map<String, String> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phones=" + phones + ", address=" + address + ", courses="
				+ courses + "]";
	}
	
	
}
