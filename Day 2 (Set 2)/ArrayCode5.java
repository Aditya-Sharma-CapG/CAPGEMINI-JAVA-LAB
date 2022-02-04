package com.aditya;

class Fruit{}
class Vehicle{}

public class ArrayCode5 {

	public static void main(String[] args) {
		
		Fruit apple = new Fruit();
		Vehicle car = new Vehicle();
		
		System.out.println("car IS A Fruit: " + (car instanceof Fruit));
		
	}
}
