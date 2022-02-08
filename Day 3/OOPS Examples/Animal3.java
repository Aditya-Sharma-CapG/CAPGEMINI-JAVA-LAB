package com.aditya;

public class Animal3 {

	public void display() {
		System.out.println("I am an animal.");
	}
	
	public static void main(String[] args) {
		Doggy d1 = new Doggy();
		d1.printMessage();
	}
}

class Doggy extends Animal3 {
	@Override
	public void display() {
		System.out.println("I am a dog");
	}
	
	public void printMessage() {
		display();
		super.display();
	}
}
