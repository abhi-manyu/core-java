package com.java8.lambda.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListcomparator
{
	public static void main(String[] args)
	{
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(20);
		li.add(10);
		li.add(25);
		li.add(5);
		
		System.out.println("before sort: "+li);
		Collections.sort(li);
		System.out.println("After ascending sort: "+li);
		Collections.sort(li, new MyComparator() );
		System.out.println(li);
		
	}

}
