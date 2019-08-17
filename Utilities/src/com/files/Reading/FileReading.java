package com.files.Reading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		
		//first i m creating a file and then writing into that 
		/*FileWriter fw = 
				new FileWriter("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\"
						+ "com\\files\\reading\\test.txt");
		
		fw.write("Hello good morning india, How are you ?");
		fw.flush();
		fw.close();*/
		
		//time to read the Context of the File created before
		FileReader fr = new FileReader("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\"
				                                    + "Utilities\\src\\com\\files\\Reading\\test.txt");
		int number = fr.read();
		while(number != -1)
		{
			System.out.print((char)number);
			number = fr.read();
		}
		
		fr.close();

	}

}
