package com.files.Writing;

import java.io.File;
import java.io.IOException;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		File file =
				new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\core-java\\Utilities\\src\\com\\files\\Writing" ,
						                                                                        "output.xlsx");
		file.createNewFile();
		System.out.println("created successfully");

	}

}
