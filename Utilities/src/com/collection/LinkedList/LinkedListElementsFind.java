package com.collection.LinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LinkedListElementsFind
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		   list.push(84);
		   list.push(68);
		   list.push(87);
		   list.push(84);
		   list.push(87);
		   
		   findOccurances(list);
	}
	public static void findOccurances(LinkedList<Integer> list)
	{
		Map<Integer,Integer> maps=new HashMap<>();
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			if(maps.containsKey(key))
				maps.put(key, maps.get(key)+1);
			else
				maps.put(key, 1);
		}
		//here all the elements as key with their occurance as value are peresent in map
		
		//printing the map elements
		for(Map.Entry<Integer,Integer> entry:maps.entrySet())
		{
			System.out.println(entry.getKey()+" is repeated "+entry.getValue()+" times");
		}
	}

}
