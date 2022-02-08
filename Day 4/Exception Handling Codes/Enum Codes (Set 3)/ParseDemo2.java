package com.aditya;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDemo2 {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "08/02/2022";
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println("parsed local date: " + localDate);
		System.out.println("formatted local date: " + formatter.format(localDate));
	}
}
