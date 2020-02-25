package com.files.Writing;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreating_Writing {

	public static void main(String[] args) throws IOException {
		FileWriter fw = 
				new FileWriter("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\"
						+ "com\\files\\Writing\\testing.doc", true);
		fw.write("this is written very first");
		fw.write('\n');
		fw.write("this is to check if new texts are getting appended or not ?,");
		fw.flush();
		fw.close();

		
	}

}