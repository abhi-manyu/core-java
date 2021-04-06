package com.java8.lambda.simple.evenORodd;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOrOdd
{
   public static void main(String[] args)
   {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("enter the number u want to check if it is even or odd");
	  int number = scn.nextInt();
	  scn.close();
	  Predicate<Integer> ch=num->num%2==0;
	  if(ch.test(number))
		  System.out.println("even");
	  else
		  System.out.println("odd");
	  
   }
}
