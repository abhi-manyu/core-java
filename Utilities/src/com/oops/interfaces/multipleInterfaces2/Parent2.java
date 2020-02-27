package com.oops.interfaces.multipleInterfaces2;

public interface Parent2 {
   default void print()
   {
	   System.out.println("in parent2 print() method");
   }
   
   static void whereAreYou()
	{
		System.out.println("i m in parent2 static method");
	}
}
