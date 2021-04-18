package com.java8.lambda.multiThread.simple;

public class MultiThread
{
   public static void main(String[] args)
   {
	
	  Runnable r = ()->
	  {
		  for(int j=0;j<5;j++)
			System.out.println("child thread");
	  };
	   
	   Thread t=new Thread(r);
	   t.start();
	   for(int i=0;i<5;i++)
		 System.out.println("main thread");
  }
}
