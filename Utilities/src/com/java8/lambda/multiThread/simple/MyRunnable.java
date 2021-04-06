package com.java8.lambda.multiThread.simple;

public class MyRunnable implements Runnable
{

	@Override
	public void run()
	{
		for(int i=0; i<5;i++)
		{
			System.out.println("child thread not used");
		}

	}
	
	/*()->{
		for(int j=0;j<5;j++)
		{
			System.out.println("child thread");
		}
	};*/

}
