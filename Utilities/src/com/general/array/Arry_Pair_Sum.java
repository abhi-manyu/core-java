package com.general.array;

import java.util.HashMap;
import java.util.Map;

public class Arry_Pair_Sum
{
	public static void main(String[] args)
	{
		int[] arr1={1, 2, 4, 5, 7,3};
		int[] arr2={5, 6, 3, 4, 8} ;
		findPair(arr1,arr2, arr1.length,arr2.length,9);
	}
	
	public static void findPair(int[] arr1, int[] arr2 , int len1,int len2 , int sum)
	{
		Map<Integer,Integer> container=new HashMap<>();
		for(int i=0;i<len1;i++)
		{
			container.put(arr1[i],0);
		}
		for(int j=0; j<len2;j++)
		{
			if(container.containsKey(sum-arr2[j]))
				System.out.println(sum-arr2[j]+"---"+arr2[j]);
			/*else
				System.out.println("no pair found");*/
		}
	}

}
