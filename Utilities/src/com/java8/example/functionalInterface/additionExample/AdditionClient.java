package com.java8.example.functionalInterface.additionExample;

public class AdditionClient
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		AdditionInterface ai=(a,b)->{
			System.out.println("inside add method");
			System.out.println("lambda sum is : "+(a+b));
			System.out.println("exiting from add method");
			return a+b;
		};
		
		int sum = ai.add(45,56);
		System.out.println("displaying sum in main method is : "+sum);
		System.out.println("exiting main");
	}
}
