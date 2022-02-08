//importing the file class

package com.aditya;

import java.io.File;

public class Code1 {

	public static void main(String[] args) {
		
		File file = new File("newFile.txt");
		
		try {
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
