package com.collection.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable
{
   public static void main(String[] args) {
	Employee e1 = new Employee(101,"Abhimanyu");
	Employee e2 = new Employee(104,"Arabinda");
	Employee e3 = new Employee(103,"Ansuraj");
	Employee e4 = new Employee(102,"Charulata");
	List<Employee> li= new ArrayList<Employee>();
	li.add(e1);
	li.add(e2);
	li.add(e3);
	li.add(e4);
	System.out.println(li);
	
	Collections.sort(li);
}
}
