package com.aditya;

public class Animal7 {

	protected void display() {
		System.out.println("I am an animal.");
	}
	
	public static void main(String[] args) {
		
		Dogy labrador = new Dogy();
		
		labrador.name = "Rocky";
		labrador.display();
		labrador.getInfo();
	}
}

class Dogy extends Animal7 {
	
	public String name;

	public void getInfo() {
		System.out.println("My name is " + name);
	}
}
