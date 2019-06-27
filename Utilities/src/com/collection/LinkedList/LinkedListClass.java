package com.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class LinkedListClass
{
	static int count=0,repl;
	public static void main(String[] args)
	{
	   List<Integer> list=new LinkedList<>();
	   list.add(10);
	   list.add(4);
	   list.add(7);
	   list.add(18);
	   list.add(45);
	   list.add(84);
	   list.add(68);
	   list.add(87);
	   
	   Iterator<Integer> itr=list.iterator();
	   int index=0,near_Back=0,near_Next=0,nearest=0;
	   while(itr.hasNext())
	   {
		   int num=itr.next();
		   if(num%5!=0)
		   {
			  count=0;
			  near_Back=findBackwardNearest(num);
			  
			  count=0;
			  near_Next=findForwardNearest(num);
			  
			  System.out.println(near_Back+"-----"+num+"-------"+near_Next);
			  
			  if((near_Next-num)<(num-near_Back))
				  nearest=near_Next;
			  else
				  nearest=near_Back;
			  index=list.indexOf(num);
			  list.set(index, nearest);
		   }
	   }
	   System.out.println(list);
	}
	public static int findForwardNearest(int number)
	{
		while(count<5)
		{
			if(number%5==0)
			{
				repl=number;
				break;
			}
			else
			{
			   count++;
			   findForwardNearest(++number);
			}
		}
		return repl;
	}
	
	public static int findBackwardNearest(int number)
	{
		while(count<5)
		{
			if(number%5==0)
			 {
				repl=number;
				break;
			 }
			else
			{
			   count++;
			   findBackwardNearest(--number);
			}
		}
		return repl;
	}
}