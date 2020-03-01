package com.openingApplication.example;

public class OPerningNotePad
{
   public static void main(String[] args)
	{
		Runtime rt = Runtime.getRuntime();
		try
		{
			Process prc = rt.exec("notepad");
			Thread.sleep(5000);
			prc.destroy();
		} catch (Exception e)
		{
			System.out.println("i m sorry, i can not open");
		}
	}
}
