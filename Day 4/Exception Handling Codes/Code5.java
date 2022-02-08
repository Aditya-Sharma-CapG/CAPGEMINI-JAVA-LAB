package com.aditya;

import java.io.*;

public class Code5 {

	public static void main(String[] args) {
		
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		}
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
