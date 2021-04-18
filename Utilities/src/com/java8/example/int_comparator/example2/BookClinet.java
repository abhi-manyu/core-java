package com.java8.example.int_comparator.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookClinet
{
	public static void main(String[] args)
	{
        
        List<Book> li = new ArrayList<Book>();
        li.add(new Book(101,"java",1000));
        li.add(new Book(108,"RESTful web service",356));
        li.add(new Book(115,"Data science",4478));
        li.add(new Book(107,"Spring boot",1000));
        li.add(new Book(114,"Spring",655));
        li.add(new Book(103,"Hibernate",265));
        
        System.out.println("before sorting : "+li);
        
        //method 1 : 
        
		/*
		 * Comparator<Book> bc = (b1,b2)-> { return
		 * (b1.getBook_id()<b2.getBook_id())?-1: (b1.getBook_id()>b2.getBook_id()?1:0);
		 * };
		 * 
		 * Collections.sort(li,bc);
		 */
        
        //or else inplace of the comparator object, we can write whole implementation
        Collections.sort(li,(b1,b2)->(b1.getBook_id()<b2.getBook_id()?-1:
        	(b1.getBook_id()>b2.getBook_id())?1:0));
        
          System.out.println("after sorting : "+li);
	}

}
