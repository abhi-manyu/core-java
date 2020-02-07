package com.general.calculator;

import java.util.Scanner;

public class MakingSingleDigit {
    public static void main(String[] args) {
		System.out.println("lets make the number into a single digit");
		System.out.println("enter the number");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int totalSum=findSum(number);
		System.out.println(number+"-----"+totalSum);
    }
    
    public static int findSum(int number)
    {
    	int sum=0;
    	int num = number;
    	if(num <= 9)
    	   return num;
    	else 
    	{
    	  while(num>0)
  		   {
  		     sum+=num%10;
  		   num=num/10;
  		   }
      	return findSum(sum);
    	}
    }
}
