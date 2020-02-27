package com.oops.interfaces.multipleInterfaces2;

public interface Parent1 {

	default void print()
	{
		System.out.println("in parent1 print() method");
	}
	
	static void whereAreYou()
	{
		System.out.println("i m in parent1 static method");
	}
}
