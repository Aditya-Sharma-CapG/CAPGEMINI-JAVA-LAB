package com.aditya;

public class Animal6 {

	public void eat() {
		System.out.println("I can eat");
	}
	
	public static void main(String[] args) {
		
		Rabbit labrador = new Rabbit();
		
		labrador.eat();
		labrador.bark();
	}
}

class Rabbit extends Animal6 {
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("I eat Rabbit food");
	}
	
	public void bark() {
		System.out.println("I can bark");
	}
}
