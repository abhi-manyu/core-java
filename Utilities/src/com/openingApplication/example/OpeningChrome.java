package com.openingApplication.example;

public class OpeningChrome
{
	//this will open the new chrome browser and search for fb and youtube, and instagram in
	// 3 different tabs
   public static void main(String[] args)
	{
	   try
		   {
		   Runtime rt = Runtime.getRuntime();
			Process prc = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe "
					+ "https://www.youtube.com/watch?v=J2aY6cvk-WI");
				
			Thread.sleep(5000);
			prc.destroyForcibly();
			
				/*
				 * Process prc2 =
				 * rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe " +
				 * "www.youtube.com"); Process prc3 =
				 * rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe " +
				 * "www.instagram.com");
				 * 
				 * Thread.sleep(5000); prc3.destroy(); prc2.destroy();
				 */
			
		   }
	   catch (Exception e) {
		System.out.println("sorry");
	}
	}
}
