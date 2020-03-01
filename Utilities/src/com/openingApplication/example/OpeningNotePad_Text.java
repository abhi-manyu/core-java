package com.openingApplication.example;

public class OpeningNotePad_Text
{
	
	//this will open a textpad window witha notepad text i.e pre written into it
	public static void main(String[] args)
	{
       Runtime rt = Runtime.getRuntime();
       try {
    	   // following code only opens the text in notepad
				
				/*
				 * rt.exec("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe " +
				 * "C:\\Users\\Abhimanyu\\Desktop\\mainclass.txt");
				 */
				 
    	   
    	   // but this code opens and then closes the window as well.
				  Process prc = rt.exec("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe " +
				  "C:\\Users\\Abhimanyu\\Desktop\\mainclass.txt");
				  Thread.sleep(5000);
    	   prc.destroy();
    	   
       }
       catch (Exception e) {
		System.out.println("can not open");
	}
	}
}
