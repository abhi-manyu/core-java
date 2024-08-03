package com.openingApplication.example;

public class Calculator
{

	public static void main(String[] args)
		{
           try {
        	   Runtime rt = Runtime.getRuntime();
        	   //Process prc =   rt.exec("C:\\WINDOWS\\system32\\calc");
        	   Process prc =   rt.exec("C:\\WINDOWS\\system32\\calc");
        	   Thread.sleep(5000);
   			prc.destroyForcibly();
           }
           catch (Exception e) {
			System.out.println("sorry");
		}
		}

}
