package com.spring.constructor.injection.ambiguity;

public class Add {

	private int a;
	private int b;

	public Add(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constutor : double , double");
	}

	
	public Add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constutor : int . int");
	}


	public Add(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b =  Integer.parseInt(b);;
		System.out.println("Constutor : String , String");
	}

	
	
	public void doSum() {
		
		System.out.println("value of a " +this.a + " ::  value of b " + this.b);
		System.out.println( " sum is : " + (this.a+this.b) );
	}
	
}
