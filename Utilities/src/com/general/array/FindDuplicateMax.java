package com.general.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateMax
{
	public static void main(String[] args)
	{
		int[] arr= {376,81,376,79,95,203,376};
		arrayToList(arr);
	}
	
	public static void arrayToList(int[] arr)
	{
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		findMax(list);
	}
	
	public static void findMax(List<Integer> list)
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
		  System.out.println(max);
		 System.out.println(serchDup(list,max));
	}
	public static int serchDup(List<Integer> list1,int num)
	{
		int counter=1;
		for(int temp_num : list1)
		{
			if(temp_num==num)
				counter++;
		}
		return counter;
	}
}
