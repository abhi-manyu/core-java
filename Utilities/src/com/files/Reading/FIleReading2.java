package com.files.Reading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FIleReading2 {

	public static void main(String[] args) throws IOException {
		//first i m creating a file and then writing into that 
				File file = 
						new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\"
								+ "com\\files\\reading\\test2.txt");
				
		
		FileReader fr = new FileReader(file);
		
		char[] chars = new char[(int)file.length()];
		
		fr.read(chars);
		
		System.out.println(chars);
		

	}

}
