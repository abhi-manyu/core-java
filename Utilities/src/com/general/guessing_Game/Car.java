package com.general.guessing_Game;

import java.util.Scanner;

public class Car {

	public static void main(String[] args)
	{
		String command="";
		String choice="";
		Scanner scn=new Scanner(System.in);
		do
		{
			if(command.equalsIgnoreCase("start"))
				System.out.println("car started");
			else if(command.equalsIgnoreCase("stop"))
			    System.out.println("car stopped");
			else if(command.equalsIgnoreCase("help"))
				System.out.println("enter : \n\t"
						+ "start : to start the car\n\t"
						+ "stop : to stop the car \n\t"
						+ "help : to read mannual of the car\n\t"
						+ "quit : to quit the simulation");
			else if(command.equalsIgnoreCase("quit"))
			{
				System.out.println("enter yes : to quit \n\t no : continue");
				choice=scn.nextLine();
			}
			System.out.println("enter command");
			command=scn.nextLine();
		}
		while(choice.equalsIgnoreCase("yes") || command.equalsIgnoreCase("quit"));
	}

}
