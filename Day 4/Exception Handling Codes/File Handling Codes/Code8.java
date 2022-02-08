package com.aditya;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Code8 {

	public static void main(String[] args) {
		
		char[] array = new char[100];
		
		try {
			FileReader file = new FileReader("input.txt");
			
			BufferedReader input = new BufferedReader(file);
			
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			
			input.close();
		}
		
		catch (Exception e) {
			System.out.println("Data outside file...");
			e.getStackTrace();
		}
	}
}
