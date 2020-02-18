package com.general.operator;

import java.util.Scanner;

public class Fibonaci_Prime
{
    public static void main(String[] args)
    {
    	Scanner scn= new Scanner(System.in);
    	System.out.println("enter how many number of the terms u want to display");
    	int number = scn.nextInt();
		findFibonaci(number);
	}
    public static void findFibonaci(int number)
    {
    	int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------------------------------------");
		
		for(int i=0;i<number-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			checkIsPrime(c);
			//System.out.println(c);
		}
    }
    
    public static void checkIsPrime(int number)
    {
    	int counter=0;
    	for(int i=1;i<=number;i++)
    	{
    		if(number%i==0)
    		   counter++;
    	}
    	if(counter<=2)
    		System.out.println(number);
    }
    
}
