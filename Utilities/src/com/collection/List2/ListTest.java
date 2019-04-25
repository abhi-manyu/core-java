package com.collection.List2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest
{
   public static void main(String[] args)
   {
	
	  List<String> li=new ArrayList<>();
	  /*li.add("king");
	  li.add("Queen");*/
	  getList(li);
   }
   
   public static void getList(List<String> li)
   {
	   /*for(String names:li)
	   {
		   System.out.println("exicuting");
	   }*/
	   
	   Iterator<String> itr=li.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println("finding element : "+itr.next());
	   }
	   
   }
}
