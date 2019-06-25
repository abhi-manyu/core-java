package com.general.array;

import java.util.Arrays;

public class BinaryArraySearch
{
	public static void main(String[] args)
	{
		int[] arr={24, 29, 43, 47, 49, 59, 61, 84};
		System.out.println(Arrays.toString(arr));
		int status=binarySerch(arr, 61, 0,7);
		if(status==-1)
		  System.out.println("not found");
		else
			System.out.println("found at : "+(status+1)+"th position");
	}
	public static int binarySerch(int[] arr, int number, int left, int right)
	{
		if(left<=right)
		{
		  int mid=(left+right)/2;
		
		  if(arr[mid]==number)
			return mid;
		  else if (number<arr[mid])
		   {
			 right=mid-1;
			 return binarySerch(arr, number, left, right);
		   }
		   else if (number>arr[mid])
		    {
			 left=mid+1;
			 return binarySerch(arr, number, left, right);
		    }
		}
		 return -1;
	}

}
