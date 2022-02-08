package com.aditya;

public class Test {

	int a;
	int b;
	
	Test() {
		
		this(10, 20);
		System.out.println("Inside default constructor");
	}
	
	Test(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Test object = new Test();
	}
}
