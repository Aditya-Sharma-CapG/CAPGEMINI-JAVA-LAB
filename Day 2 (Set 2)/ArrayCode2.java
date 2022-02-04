package com.aditya;

import java.util.Arrays;

public class ArrayCode2 {
	
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6};
		
		int aLen = array1.length;
		int bLen = array2.length;
		int[] result = new int[aLen + bLen];

		System.out.println(Arrays.toString(result));
	}
}
