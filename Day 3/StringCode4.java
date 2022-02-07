// using indexOf() method to get the index of a character in a string

package com.aditya;

public class StringCode4 {

	public static void main(String[] args) {
		
		String s = "Learn Java";
		int r;
		
		r = s.indexOf('J');
		System.out.println(r);
		
		r = s.indexOf('a');
		System.out.println(r);
		
		r = s.indexOf('j');
		System.out.println(r);
		
		r = s.indexOf("ava");
		System.out.println(r);
		
		r = s.indexOf("java");
		System.out.println(r);
		
		r = s.indexOf("");
		System.out.println(r);
	}
}
