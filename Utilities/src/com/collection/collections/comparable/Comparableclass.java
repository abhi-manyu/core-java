package com.collection.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableclass //implements Comparable<Integer>
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
	 
	 System.out.println(li);
	 
	 // As we know comparable is used for natural sorting(asending order) and
	 //comparator is used for customized sorting,
	 // but in one way we can use the comparable for customize order also,
	 //by implementing our own method right ?, but it is very impossible bcz
	 // Collections.sort() method by default uses Comparable only, which in turns
	 //sorts in ascending order, if it takes Comparable type like it does take
	 // in case of customized ordering, then definitely we could have made comparable
	 //as customized order.
	 
	 //though it is taking only comparator type, so for customized ordering,
	 //only comparator is used
	 
	 
	 
	 // the main reason of comparable can not be used for customized sorting is
	 // the internal method : comparaTo(Object obj) takes only one argument
	 // so how will we compare btw existing property woth passing property ?
	 
	 
	 
	 Collections.sort(li);
	 System.out.println(li);
  }


}
