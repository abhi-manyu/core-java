package com.general.array;

import java.util.Arrays;

public class DeletingArray
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		int[] arr={59,61,84,29,47,49,24,43};
		System.out.println(Arrays.toString(arr));
		searchElementInArray(arr, 29);
		long end = System.currentTimeMillis();
		System.out.println("total time taken : "+(end-start)+" mili sec");
		
	}
	public static void searchElementInArray(int[] arr, int num)
	{
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==num)
	    	{
	    	  deleteElementInArray(arr, i);
	    	  break;
	    	}
	    }
	}
	public static void deleteElementInArray(int[] arr,int index)
	{
		for (int i =index; i < arr.length-1; i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, arr.length-1)));
	}
}
