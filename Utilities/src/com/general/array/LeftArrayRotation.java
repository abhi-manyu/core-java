package com.general.array;

import java.util.Arrays;

public class LeftArrayRotation {
  public static void main(String[] args)
  {
	  int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	  System.out.println("orginal array is : "+Arrays.toString(arr));
	  try{
		  reverseArray(arr,3);
	  }
	  catch (Exception e) {
		System.out.println("u r accessing from out of index");
	}
  }
  
  public static void reverseArray(int[] arr, int num)
  {
	  // here first i took out the temp array that contains the no of rotated elements
	  // then i shifted elements and then place the elements in place of which the datas are shifted
	  
	  
	  
	 int[] temp=Arrays.copyOfRange(arr, arr.length-num,arr.length);
	 //System.out.println(Arrays.toString(temp));
	 for(int i=arr.length-1;i>=num && i>0;i--)
	 {
		 arr[i]=arr[i-num];
	 }
	 //System.out.println(Arrays.toString(arr));
  
	 for(int i=0;i<temp.length;i++)
	 {
		 arr[i]=temp[i];
	 }
	 System.out.println("the rotated array : "+Arrays.toString(arr));
  }
  
}
