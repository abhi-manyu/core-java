package com.collection.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntegerComparator implements Comparator<Integer>
{

	public static void main(String[] args)
	  {
		 List<Integer> li = new ArrayList<Integer>();
		 li.add(23);
		 li.add(12);
		 li.add(15);
		 li.add(5);
		 li.add(11);
		 li.add(3);
		 li.add(10);
		 
		 System.out.println("before sorting : "+li);
		 Collections.sort(li);
		 System.out.println("after naturla sorting : "+li);
		 Collections.sort(li,new IntegerComparator());
		 System.out.println("natural sorting through Comparator : "+li);
		 
		 
		 
	  }

	@Override
	public int compare(Integer o1, Integer o2)
	{
		/* by comparator code:
		 * 
		 * int n1=(Integer)o1; int n2=(Integer)o2;
		 * 
		 * // ascending order //return (n1<n2)? -1:(n1>n2)?1:0;
		 * 
		 * //descending order return (n1>n2)?-1:(n1<n2)?1:0;
		 */
		
		//by comparable code
		return o2.compareTo(o1);
		
		
	}
}
