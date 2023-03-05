package com.spring.lifecycle;

public class Samosa {

		private int id;
		private double price;
		private String name;
		public Samosa(int id, double price, String name) {
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
		public Samosa() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Samosa [id=" + id + ", price=" + price + ", name=" + name + "]";
		}
		
		
		
		// we can give any name for the init method and destroy
		public void initMethod() {
			System.out.println("Inside init method ");
		}
		
		public void destroyMethod() {
			System.out.println("Inside destroy method ");
		}
		
		
}
