package com.collection.maps.extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Maps
{
   public static void main(String[] args) {
	
	   Map<Integer,String> mp=new HashMap<>();
	  mp.put(1,"Boston");
	  mp.put(2,"NewYork");
	  mp.put(3,"Texas");
	  mp.put(4,"Dellas");
	  mp.put(5,"South Corolina");
	  
	  System.out.println(mp);
	  
	  List<String> li=new ArrayList<>(mp.values());
	  
	  System.out.println("as a list before delete : "+li);
	  Iterator<String> itr=li.iterator();
	  while(itr.hasNext())
	  {
		  String city=itr.next();
		  if(city.equals("Boston"))
			  //itr.remove();
			  li.remove("Boston");
	  }
	  
	  System.out.println("as a list after delete : "+li);
}
}
