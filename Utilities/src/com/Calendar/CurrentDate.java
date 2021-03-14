package com.Calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate {

	public static void main(String[] args) {
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd-yyy");
	    LocalDateTime now = LocalDateTime.now().minusDays(1);
	    System.out.println(dft.format(now)+".csv");
	}
}
