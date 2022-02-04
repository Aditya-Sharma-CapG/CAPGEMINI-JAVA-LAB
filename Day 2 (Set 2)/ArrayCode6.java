package com.aditya;

class A{}
class B extends A{}

public class ArrayCode6 {

	public static void main(String[] args) {
		
		B objOfClassB = new B();
		
		System.out.println("ObjOfClassB is an instance of B: " + (objOfClassB instanceof B));
		System.out.println("ObjOfClassB is an instance of the parent class A: " + (objOfClassB instanceof A));
	}
}
