package com.aditya;

public class StringCode8 {

	public static void main(String[] args) {
		
		String s1 = "Learn Java";
		String s2 = "Java";
		String s3 = "java";
		Boolean r;
		
		if (s1.contains(s2)) {
			System.out.println(s1 + " contains " + s2);
		}
		else {
			System.out.println(s1 + " doesn't contains " + s2);
		}
		
		if (s1.contains(s3)) {
			System.out.println(s1 + " contains " + s3);
		}
		else {
			System.out.println(s1 + " doesn't contains " + s3);
		}
	}
}
