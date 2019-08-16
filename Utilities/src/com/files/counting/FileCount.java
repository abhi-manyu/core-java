package com.files.counting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCount {

	public static void main(String[] args) throws IOException {
		
		List<File> folders = new ArrayList<File>();
		List<File> files = new ArrayList<File>();
		System.out.println("enter the path of the directory : \n");
		Scanner scn = new Scanner(System.in);
		String dir = scn.nextLine();
		File file = new File(dir);
		String[] names = file.list();
		System.out.println("total : "+names.length+" elements found");
		for(String name : names)
		{
			File temp = new File(file, name);
			if(temp.isFile())
				files.add(temp);
			else if(temp.isDirectory())
				folders.add(temp);
			else
				System.out.println("not a valid type");
		}
	   System.out.println("---------------------------------"
	   		+ "\nthe files are :\n******************************");
	   for(File f:files)
	       System.out.println(f.getName());
	   System.out.println("---------------------------------"
		   		+ "\nthe folders are :\n******************************");
	   for(File f:folders)
	       System.out.println(f.getName());
		
	}

}
