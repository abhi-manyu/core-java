package com.java8.example.int_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorClient
{
   public static void main(String[] args) {
	
	   EmployeComparator e1 = new EmployeComparator(104,"Aabhimanyu");
	   EmployeComparator e2 = new EmployeComparator(115,"Anirudha");
	   EmployeComparator e3 = new EmployeComparator(106,"Arabinda");
	   EmployeComparator e4 = new EmployeComparator(109,"Charulata");
	   EmployeComparator e5 = new EmployeComparator(102,"Ashok");
	   EmployeComparator e6 = new EmployeComparator(113,"Ansuraj");
	   EmployeComparator e7 = new EmployeComparator(108,"Smitarani");
	   
	   List<EmployeComparator> li = new ArrayList<EmployeComparator>();
	   li.add(e1);
	   li.add(e2);
	   li.add(e3);
	   li.add(e4);
	   li.add(e5);
	   li.add(e6);
	   li.add(e7);
	   
	   System.out.println("before sorting : "+li);
	   
	   Comparator<EmployeComparator> ec=(emp1,emp2)->
	   {
		   return (emp1.getId() > emp2.getId()?-1:emp1.getId() < emp2.getId()?1:0);
	   };
	   
	   Collections.sort(li,ec);
	   System.out.println("After natural sorting by comparator : "+li);
	   
}
}
