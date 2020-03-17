package com.Calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Demo1 {

	public static void main(String[] args) {
       Calendar cal=Calendar.getInstance();
       System.out.println(cal);
       System.out.println(cal.get(Calendar.MONTH));
       
       DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd-yyy");
       LocalDateTime now = LocalDateTime.now().minusDays(1);
       System.out.println(dft.format(now));
	}

}
