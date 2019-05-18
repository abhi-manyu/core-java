package com.general.String;

public class StringContain
{
	public static void main(String[] args)
	{
		printPattern(3);
	}
	
	static void printPattern(int size)
	{
	       for(int i=1;i<=size;i++)
	       {
	           for(int j=0;j<size;j++)
	           {
	               if(i+j>=size)
	               System.out.print("#");
	               else
	               System.out.print(" ");
	           }
	           System.out.println();
	       }
	    
	}

}
