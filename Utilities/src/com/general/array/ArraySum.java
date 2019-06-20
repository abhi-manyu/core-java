package com.general.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySum
{
	static int counter,max_sum,min_sum;
	public static void main(String[] args)
	{
	   int[] arr= {5,8,3,7,9};
	   arrayToList(arr);
	}
	
	
	
	public static void arrayToList(int[] arr)
	{
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> list2=Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(findMax(list)+" "+findMin(list2));
	}
	
	
	
	public static int findMax(List<Integer> list)
	{
		counter=0;
		do
		{
		  Iterator<Integer> itr=list.iterator();
		  int max=list.get(0);
		  while(itr.hasNext())
		   {
			int num=itr.next();
			if(num>max)
				max=num;
		   }
		  list.remove(list.indexOf(max));
		  max_sum+=max;
		}
		while(list.size()>1);
		return max_sum;
	}
	public static int findMin(List<Integer> tempList)
	{
		counter=0;
		List<Integer> list=new ArrayList<>(tempList);
		do
		{
		  Iterator<Integer> itr=list.iterator();
		  int min=list.get(0);
		  while(itr.hasNext())
		   {
			int num=itr.next();
			if(num<min)
				min=num;
		   }
		  list.remove(list.indexOf(min));
		  min_sum+=min;
		}
		while(list.size()>1);
		return min_sum;
	}
}

