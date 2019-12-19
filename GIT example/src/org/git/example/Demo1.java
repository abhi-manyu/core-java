package org.git.example;

public class Demo1
{
   public static void main(String[] args)
   {
	System.out.println("this is main method");
	first();
	first(50,30);
	second();
	third();
	fourth();
   }
   
   public static void first()
   {
	   System.out.println("this is the addition method with out arguments");
   }
   public static void first(int a, int b)
   {
	   System.out.println("this is the addition method with 2 args");
	   int result = a+b;
	   System.out.println("the result is : "+result);
   }
   public static void second()
   {
	   System.out.println("this is the second method");
   }
   
   public static void third()
   {
	   System.out.println("this is the third method");
   }
   
   public static void fourth()
   {
	   System.out.println("this is the fourth method");
   }
}
