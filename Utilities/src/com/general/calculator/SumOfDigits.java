package com.general.calculator;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
		System.out.println("lets calculate the su of the digits of ur number");
		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur number");
		int number = scn.nextInt();
		int sum = 0;
		while (number>0)
		{
			sum += number%10;
			number=number/10;
		}
		System.out.println("the sum of the didgits is : "+sum);
	}
}
