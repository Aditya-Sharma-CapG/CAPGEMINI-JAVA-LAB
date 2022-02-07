package com.aditya;

abstract class Animal8 {

	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat");
	}
	
	public static void main(String[] args) {
		
		Doggi d1 = new Doggi();
		
		d1.makeSound();
		d1.eat();
	}
}

class Doggi extends Animal8 {
	
	public void makeSound() {
		System.out.println("Bark bark");
	}
}
