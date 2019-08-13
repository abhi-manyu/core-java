package com.files.basics;

import java.io.File;
import java.io.IOException;

public class FileBasic {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// we can create file by giving the path with the file name as well like bellow, 
		//also we can specify the type of the file like abc.txt or abc.doc etc
		
		//creating a new file
		File f=new File("H:\\Javastuffs\\Work_day1\\created_By_Java.txt");
		
		//creating a new folder in specified path
		File f2=new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\" 
				+ "files\\basics\\second");
		
		
		//we can create a file in a specified directory by specifying the directory and the file name 
		//at sam time and by the following constructor as well
		File f3= new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\" 
				+"files\\basics","example.txt");
		
		
		//checks if the file specifed is exists or not ?
		//System.out.println(f3.exists());
		//f3.createNewFile();
		//System.out.println(f3.exists());
		
		
		//creating new folder and create a new file inside that
		
		File folder=new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\" 
				+ "files\\basics","folder");
		//folder.createNewFile();
		
		//chercking it , weather it is a folder
		//System.out.println("is this a file : "+folder.isFile());
		//chercking it , weather it is a file
		//System.out.println("is this a folder : "+folder.isDirectory());

		
		File file=new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\" 
				+ "files\\basics","file.txt");
	    file.createNewFile();
	    System.out.println("created");
	    
	    System.out.print("deleting the file : ");
	    int dot_counter=0;
	    while(dot_counter<10)
	    {
	    	System.out.print("..");
	    	Thread.sleep(1000);
	    	dot_counter++;
	    }
	    System.out.println();
	    System.out.println("file deleted : "+file.delete());
	    
	    
	    //System.out.println("is this a file : "+file.isFile());
		//System.out.println("is this a folder : "+file.isDirectory());

		/*File count = new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\files\\basics");
		String[] counts=count.list();
		for(String name : counts) {
			System.out.println(name);
		}*/
	    
	    
	    
	    
	    
	    
	    
	}

}
