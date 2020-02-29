package com.general.scanner;

import java.util.Scanner;

public class Patterns
{
   public static void main(String[] args)
   {
	   Scanner scn = new Scanner(System.in);
	   System.out.println("enter how many rows u want");
	   int row= scn.nextInt();
	   System.out.println("enter how many calumns u want");
	   int col=scn.nextInt();
	   scn.close();
	   int temp=0;
	   int dec=0;
	   for(int i =1; i<=row; i++)
	   {
		  temp=col-dec;
		  int j = 1;
		   for (; j<=col; j++)
		   {
			   if(j<=temp)
				   System.out.print(j+" ");
			   else
				  System.out.print(temp+" ");
		   }
		   System.out.println();
		   dec++;
		   j--;
	   }
    }
}
