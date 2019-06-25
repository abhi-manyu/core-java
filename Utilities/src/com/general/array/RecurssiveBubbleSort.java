package com.general.array;

import java.util.Arrays;

public class RecurssiveBubbleSort
{
	//bubble sort by recurssive method
	
	public static void main(String[] args)
	{
		int[] arr={59,61,84,29,47,49,24,43};
		System.out.println("orginal array : "+Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("sorted is : "+Arrays.toString(arr));
	}
    
	public static void bubbleSort(int[] arr, int leng)
	{
		int i;
		if(leng==1)
			return;
		for(i=0;i<leng-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubbleSort(arr,leng-1);
		//System.out.println(Arrays.toString(arr));
	}
}
