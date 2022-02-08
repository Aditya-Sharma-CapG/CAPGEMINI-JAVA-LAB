package com.aditya;

public class Animal5 {

	void Animal() {
		System.out.println("I am an animal");
	}
	
	public void Animal(String type) {
		System.out.println("Type:" + type);
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.Animal();
	}
}

class Cat extends Animal5 {
	
	Cat() {
		super.Animal("Animal");
		System.out.println("I am a cat");
	}
}

