package com.general.array;

import java.util.Arrays;

public class SelectionSort
{
	public static void main(String[] args)
	{
        int[] arr= {44,54,12,82,11};
        System.out.println(Arrays.toString(arr));
        selectioSort(arr);
	}
	  // steps:
			// Find the minimum element in arr[0...4], smallest is : 11
			// and place it at beginning
			//11 54 12 82 44

			// Find the minimum element in arr[1...4] , smallest is : 12
			// and place it at beginning of arr[1...4]
			//11 12 54 82 44

			// Find the minimum element in arr[2...4], smallest is : 44
			// and place it at beginning of arr[2...4]
			//11 12 44 82 54

			// Find the minimum element in arr[3...4]
			// and place it at beginning of arr[3...4]
			//11 12 44 54 82 
	
	
	public static void selectioSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min=arr[i];
			int min_index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					min_index=j;
				}
			}
		   int temp=arr[i];
		   arr[i]=min;
		   arr[min_index]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
