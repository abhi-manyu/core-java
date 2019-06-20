package com.collection.List2;

import java.util.ArrayList;
import java.util.List;

public class ListDelete {
  public static void main(String[] args) {
	
	  List<Integer> list=new ArrayList<Integer>();
	  list.add(53);
	  list.add(8);
	  list.add(16);
	  list.add(23);
	  list.add(53);
	  System.out.println(list);
	  
	  list.remove(new Integer(53));
	  System.out.println(list);
}
}
