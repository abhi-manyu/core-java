package com.java8.lambda.simple.calculator;

import java.util.Scanner;
import java.util.function.Function;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the correxponding number of u operation u want to perform"
				+ "\n\n1\t addition\n2\t subtraction\n3\t multiplication\n4\t devidation");
		int number = scn.nextInt();
		System.out.println("enter 1st number to perform above operation");
		Double num1 = scn.nextDouble();
		System.out.println("enter 2nd number to perform above operation");
		Double num2 = scn.nextDouble();
		
		switch (number)
		{
		case 1:
			if(num1!=null && num2!=null)
				(num1,num2)->System.out.println(num1+num2);
			break;

		default:
			break;
		}
		
	}
}
