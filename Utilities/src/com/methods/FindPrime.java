package com.methods;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class FindPrime {
  // finding the prime numbers in a range in both direction i.e from 5-20 or from 20 - 5
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter ur first number");
		int num1 = scn.nextInt();
		System.out.println("enter ur second number");
		int num2 = scn.nextInt();
	    scn.close();
	    System.out.println(findAllPrimes(num1,num2));
	}
	
	public static ArrayList<Integer> findAllPrimes(int num1, int num2)
	{
		if(num1>num2)
		{
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
		}
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i=num1;i<=num2;i++)
		{
			int prime_num=i;
			int counter = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					counter++;
			}
			if(counter<=2)
				li.add(prime_num);
		}
		return li;
	}
}
