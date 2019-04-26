package com.general.calculator;

import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
       Scanner scn=new Scanner(System.in);
       System.out.println("enter first number");
       String num1=scn.nextLine();
       System.out.println("enter ur second number");
       String num2=scn.nextLine();
       int result=Calculator.sum(num1, num2);
       System.out.println("ur sum is :"+result);
       scn.close();
	}
}
