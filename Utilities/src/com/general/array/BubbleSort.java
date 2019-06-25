package com.general.array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args)
	{
		int[] arr={59,61,84,29,87};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
	}
	
	// here in bubble sort in each pass or for each value of i , 
	// we will compare the value of arr[i] with arr[i+1] ,
	// if found the arr[i] is greater, then swap it with the arr[i+1] 
	public static void bubbleSort(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			//boolean value is taken to reduce unnecessary passes while already our array is sorted
		   boolean swapped=false;
		   
		   
		   //now in inner loop we will do the compare for each value with it's next value,
		   // and if found bigger then swap it.
		   // then so same for j++
		   //this is considered as a single pass
		   
		   
		   for(int j=0;j<arr.length-1;j++)
		    {
			  if(arr[j]>arr[j+1])
			    {
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  swapped= true;
			    }
		    }
		   count++;
		   
		   // here checked that if thge inner loop has changed or swapped something or not if ,
		   // not changed or swapped thgat means the array is allready is sorted so no need to 
		   // go thorough unnecessary passes
		   
		   if(swapped==false)
			   break;
		}
		System.out.println("total passing no : "+count);
		System.out.println(Arrays.toString(arr));
	}

}
