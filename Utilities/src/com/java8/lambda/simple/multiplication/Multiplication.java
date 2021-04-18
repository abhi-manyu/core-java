package com.java8.lambda.simple.multiplication;

import java.util.Scanner;

public class Multiplication
{
  public static void main(String[] args)
    {
	  // though we can remove the type of argument provided and square braces ( ) as only one parameter 
	  //is being passed, so it can be furthur optimised as 
	  Scanner scn= new Scanner(System.in);
	  System.out.println("enter the 1st number u want to multiply");
	  int nm1=scn.nextInt();
	  System.out.println("enter 2nd number u want to multiply");
	  int nm2 = scn.nextInt();
	  Multiply m= (num1,num2)->System.out.println(num1*num2);
	  m.multiply(nm1, nm2);
	 
   }
}


interface Multiply
{
   public void multiply(int num1, int num2);
	
}
