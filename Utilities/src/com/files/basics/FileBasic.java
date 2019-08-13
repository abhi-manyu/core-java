package com.files.basics;

import java.io.File;
import java.io.IOException;

public class FileBasic {

	public static void main(String[] args) throws IOException
	{
		// we can create file by giving the path with the file name as well like bellow, 
		//also we can specify the type of the file like abc.txt or abc.doc etc
		
		File f=new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\"
				+ "files\\basics\\abc.doc");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		
	}

}
