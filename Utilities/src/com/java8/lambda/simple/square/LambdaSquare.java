package com.java8.lambda.simple.square;

import java.util.Scanner;
import java.util.function.Function;

public class LambdaSquare
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number u want to find square of");
		double number = scn.nextDouble();
		scn.close();
		
		Function<Double,Double> f=num->num*num;
		System.out.println(f.apply(number));
	}
	
}
