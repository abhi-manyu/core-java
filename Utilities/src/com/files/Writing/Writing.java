package com.files.Writing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\files\\Writing","out.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\"
				+ "Utilities\\src\\com\\files\\Writing\\out.txt" , true);
		fw.write("this is second time appended to the file");
		fw.flush();
		fw.close();

	}

}
