package com.general.calculator;

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
	System.out.println("elt's calcualte the factorial of the given number !!");
	System.out.println("enter the number u want to calculate the factorial");
	Scanner scn = new Scanner(System.in);
	int number = scn.nextInt();
	int fact = 1;
	for (int i = number; i >=1; i--)
	{
		if(number==0)
		{
			fact=0;
		    break;
		}
		else if(number==1)
		{
		    System.out.println(1);
		    break;
		}
		else
			fact*=i;
	}
	System.out.println("the factorial of ur given number is : "+fact);
}
}
