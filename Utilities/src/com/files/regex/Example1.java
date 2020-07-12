package com.files.regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1
{
	public static void main(String[] args) throws IOException
	{
		Path path = Paths.get("F:\\Download\\temp.txt");
		String question = "To be or not to be?"
				+ "testing to check";
	     
		Files.write(path,question.getBytes());
	}

}
