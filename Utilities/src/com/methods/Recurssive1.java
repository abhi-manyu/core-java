package com.methods;

public class Recurssive1 {

	public static void main(String[] args) {
		System.out.println("printing from 1 to 10 with out using loop");
		print(1);
	}
	
	public static void print(int number)
	{
		if(number<=10)
		{
			System.out.println(number);
			print(number+1);
		}
		return;
	}
}
