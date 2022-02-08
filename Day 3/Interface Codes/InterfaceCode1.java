package com.aditya;

public interface InterfaceCode1 {

	void getName(String name);
	
	public static void main(String[] args) {
		
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}
}

class ProgrammingLanguage implements InterfaceCode1 {
	
	public void getName(String name) {
		System.out.println("Programming Language:" + name);
	}
}
