package com.general.operator.ternaryOperators;

public class TernaryOperators
{
  public static void main(String[] args)
  {
	 System.out.println(print(59));
  }
  
  public static String print(int number)
  {
	  // ternary operator can be used if and only oif right hand side variable is
	  //there or else directly we are returning somr thing from the method.
	  return (number%2==0)?"even":"odd";
  }
}
