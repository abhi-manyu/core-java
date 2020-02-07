package com.general.condition;

import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
	System.out.println("lets guess today\nplease enter the number of ur choice");
	Scanner scn = new Scanner(System.in);
	int number = scn.nextInt();
	scn.close();
	switch (number) {
	//  inside case value always constant value should be provided, or else we will compile time error. 
	case 1:
		System.out.println("oh, it is a sunday");
		break;
   case 2:
	   System.out.println("it is monday, u have work");
	   break;
   case 3:
	   System.out.println("it is tuesday");
	   break;
	default:
		System.out.println("it is a holyday for you");
		break;
	}
	
}
}
