package com.aditya;

import java.io.FileInputStream;
import java.io.InputStream;

public class Code4 {

	public static void main(String[] args) {
		
		byte[] array = new byte[100];
		
		try {
			InputStream input = new FileInputStream("input.txt");
			
			System.out.println("Available bytes in the file: " + input.available());
			
			input.read(array);
			System.out.println("Data read from the file:");
			
//			creating byte array into string
			String data = new String(array);
			
			input.close();
		}
		
		catch (Exception e) {
			System.out.println("Empty array");
			e.getStackTrace();
		}
	}
}
