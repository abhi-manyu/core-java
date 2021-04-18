package com.java8.example.functionalInterface.multithreading;

public class MainThread
{
    public static void main(String[] args)
    {
		Runnable mr = ()-> {
			for(int i=0;i<=5;i++)
			{
				System.out.println("in child thread");
			}
		};
		
		Thread t = new Thread(mr);
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("in main thread");
		}
	}
}
