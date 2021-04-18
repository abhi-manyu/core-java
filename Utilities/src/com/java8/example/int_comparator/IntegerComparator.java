package com.java8.example.int_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntegerComparator //implements Comparator<Integer>
{
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(2);
		li.add(8);
		li.add(18);
		li.add(19);
		li.add(16);
		li.add(12);
		li.add(9);
		
		System.out.println("before sorting"+li);
		
		Comparator<Integer> cm=(n1,n2)->{
			return (n1>n2)?-1:(n1<n2)?1:0;
		};
		
		Collections.sort(li,cm);
		System.out.println("after descending sorting by comparator : "+li);
	}

}
