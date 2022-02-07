package com.aditya;

class Animal2 {
	
   protected void displayInfo() {
      System.out.println("I am an animal.");
   }

   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
	}
}

	class Dog extends Animal2 {
	   public void displayInfo() {
	      System.out.println("I am a dog.");
	   }
	}

	

