package com.aditya;

import java.io.File;

public class Code3 {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\Guest User\\Desktop\\Java File\\List Method");
			
			String[] fileList = file.list();
			
			for(String str: fileList) {
				System.out.println(str);
			}
		}
		catch (NullPointerException e) {
			System.out.println("File is empty");
			System.out.println(e.getMessage());
		}
	}
}
