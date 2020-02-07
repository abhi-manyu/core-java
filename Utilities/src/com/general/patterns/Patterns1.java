package com.general.patterns;

import java.util.Scanner;

public class Patterns1 {
      public static void main(String[] args) {
		System.out.println("enter the dimensssion u want to the pattern");
		Scanner scn = new Scanner(System.in);
		int dimen=scn.nextInt();
		
		for(int i=0;i<=dimen;i++)
		{
			for (int j = 0; j <=dimen; j++)
			{
				if(i==j)
				  break;
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
