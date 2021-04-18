package com.java8.lambda.collection.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer arg0, Integer arg1)
	{
		return (arg0>arg1)?-1:((arg0<arg1)?1:0);
	}

}
