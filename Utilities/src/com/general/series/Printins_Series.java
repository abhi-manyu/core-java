package com.general.series;

import java.util.Scanner;

public class Printins_Series {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number of terms : \n ");
		
		int terms = scn.nextInt();
		
		double first_term = 1;
		
		for(double i=2; i<=terms;i++)
		{
			double second_term = 1/i;
			first_term =first_term-second_term;
		}
		System.out.println("result is : "+first_term);
	}
}
