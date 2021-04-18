package com.java8.lambda.simple.lambdaconversion;

import java.util.Scanner;

public class Addition
{
   public static void main(String[] args)
   {
	   Scanner scn=  new Scanner(System.in);
	   System.out.println("enter 1st number");
	   int num1=scn.nextInt();
	   System.out.println("enter 2nd number");
	   int num2=scn.nextInt();
	   scn.close();
	 lambdaAddition la = (a,b)->System.out.println(a+b);
	 la.add(num1,num2);
	  
   }
}

interface lambdaAddition
{
	public void add(int a, int b);
}
