package com.java8.example.functionalInterface;

public class Client
{

	public static void main(String[] args)
	{
		
		  // i = new Interface1Impl(); i.print1();
		 
		
		
		  Interface1 i = ()->System.out.println("Hello world by lambda");
		  i.print1();
		 

	}

}
