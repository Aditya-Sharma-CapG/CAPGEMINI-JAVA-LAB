package com.aditya;

public class Animal4 {

	protected String type = "mammal";
	
	public static void main(String[] args) {
		Dogg d1 = new Dogg();
		d1.printType();
	}
}

class Dogg extends Animal4 {
	public String type = "mammal";
	
	public void printType() {
		System.out.println("I am a " + type);
		System.out.println("I am a " + super.type);
	}
}
