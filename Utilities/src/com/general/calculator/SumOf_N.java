package com.general.calculator;

import java.util.Scanner;

public class SumOf_N {
     public static void main(String[] args) {
		System.out.println("enter the number upto which u eant to find the sum");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		double sum=0.0;
		for(int i =0; i<=number;i++)
		{
			sum+=i;
		}
		System.out.println("the all sum is : "+sum);
	}
}
