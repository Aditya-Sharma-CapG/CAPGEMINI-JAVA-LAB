package com.aditya;

public class Code11 {

	public static void main(String[] args) {
		
		first:
		for(int i = 0; i < 5; i++) {
			second:
			for(int j = 1; j < 3; j++) {
				if(i == 2) {
					break first;
				}
			}
		}
	}
}
