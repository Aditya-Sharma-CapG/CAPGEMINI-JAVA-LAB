package com.aditya;

public class Test_ {

	int a;
	int b;
	
	Test_() {
		a = 10;
		b = 20;
	}
	
	Test_ get() {
		return this;
	}
	
	void display() {
		System.out.println("a=" + a + " =" + b);
	}
	
	public static void main(String[] args) {
		
		Test_ o = new Test_();
		o.get().display();
	}
}
