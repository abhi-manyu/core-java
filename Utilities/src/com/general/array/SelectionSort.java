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
			// Find the maximum element in arr[0...4], smallest is : 11
			// and place it at beginning
			//11 54 12 82 44

			// Find the maximum element in arr[1...4] , smallest is : 12
			// and place it at beginning of arr[1...4]
			//11 12 54 82 44

			// Find the maximum element in arr[2...4], smallest is : 44
			// and place it at beginning of arr[2...4]
			//11 12 44 82 54

			// Find the maximum element in arr[3...4]
			// and place it at beginning of arr[3...4]
			//11 12 44 54 82 
	
	// we can do sorting in both ascending and descending order by any of sorting method like
	// this selection sort
	
	
	// By putting max to right positions
	public static void selectioSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int max=arr[i];
			int max_index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					max_index=j;
				}
			}
		   int temp=arr[i];
		   arr[i]=max;
		   arr[max_index]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
