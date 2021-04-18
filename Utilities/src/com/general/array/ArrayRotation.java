package com.general.array;

import java.util.Arrays;

public class ArrayRotation {
  public static void main(String[] args)
  {
	  int[] arr= {7,2,4,9,15,11,5};
	  System.out.println("orginal array is : "+Arrays.toString(arr));
	  try
	    {
		  rotateToLeft(arr, 3);
	    }
	  catch (Exception e)
	  {
		 System.out.println("u r accessing elements larger than ur array size");
	  }
  }
  public static void rotateToLeft(int[] arr, int n)
  {
	  // used for getting a sub array of elements in a given array
	  int[] temp=Arrays.copyOfRange(arr, 0,n);
	  System.out.println(Arrays.toString(temp));
	  for(int i=0;i<arr.length-n;i++)
	  {
		  arr[i]=arr[i+n];
	  }
	  int j=0;
	  for(int i=arr.length-n;j<temp.length;i++,j++)
	  {
		  arr[i]=temp[j];
	  }
	  System.out.println("rotated array is : "+Arrays.toString(arr));
	  
  }
}
