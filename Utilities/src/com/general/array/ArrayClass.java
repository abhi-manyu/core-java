package com.general.array;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ArrayClass
{
   public static void main(String[] args)
   {
	int[] arr1={5,15,30,10,1};
	int[] arr3={5,15,30,10,1};
	int[] arr2={12,18,19,10,11};
	//System.out.println(arr);
	
	List<Integer> lists=new ArrayList<>();
	for(int num:arr1)
	{
		lists.add(num);
	}
	System.out.println(lists);
	//Arrays.sort(arr1);
	System.out.println(Arrays.binarySearch(arr1,10));
	
	//printing any array elements
    System.out.println(Arrays.toString(arr2));
    
    System.out.println(Arrays.equals(arr1, arr3));
  }

}
