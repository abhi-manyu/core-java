package com.files.Writing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingToFile {

	public static void main(String[] args) throws IOException {
		File file =
		new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\files\\Writing" ,
				                                                                        "output.txt");
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file, true);
		fw.write("this is appended to the existing file in the disk");
		fw.flush();
		fw.close();
		
		
	}

}
