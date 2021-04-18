package com.java8.example.basic_Examples;

import java.util.function.Function;

public class LambdaConversions
{

	public int findLength(String s)
	{
		return s.length() ;
	}

	
	
	
	public static void main(String[] args) {
		
		/*
		 * Function f=(s)->{ s.length(); };
		 */
		
		//f.apply("abhi");
	}
	
}



//@FunctionalInterface
interface Interf
{
   public void m1();
   public void m2();
}
