package com.aditya;

enum Size_ {
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
	Size_ pizzaSize;
	
	public Test(Size_ pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public void orderPizza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		
		case MEDIUM:
			System.out.println("I ordered a medium size pizza");
			break;

		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
}

public class Enum2 {
	public static void main(String[] args) {
		
		Test t1 = new Test(Size_.MEDIUM);
		t1.orderPizza();
	}
}
