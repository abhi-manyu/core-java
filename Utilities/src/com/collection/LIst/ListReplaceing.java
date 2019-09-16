package com.collection.LIst;

import java.util.ArrayList;

public class ListReplaceing
{
    public static void main(String[] args)
    {
    	Employee emp1=new Employee(1,"abhi","165416565");
 	   Employee emp2=new Employee(2,"arabinda","241652474");
 	   Employee emp3=new Employee(3,"anshuraj","14789632");
 	  /*Employee emp4=new Employee(4,"Ashok","14789632");
 	   Employee emp5=new Employee(5,"Anirudha","14789632");*/
 	   ArrayList<Employee> emplist=new ArrayList<>();
 	   
 	    emplist.add(emp1);
 	    emplist.add(emp2);
 	    System.out.println("list size b4 adding: "+emplist.size());
 	    
 	    System.out.println("index ---0 "+emplist.get(0));
 	   System.out.println("index ----1 "+emplist.get(1));
 	   /*emplist.add(emp3);
 		emplist.add(emp4);
 		emplist.add(emp5);*/
 	    
 	    emplist.add(2,emp3);
 	    
 	    System.out.println("after adding new \n -------------------------------------------------------");
 	   System.out.println("index ---0 "+emplist.get(0));
 	   System.out.println("index ----1 "+emplist.get(1));
 	  System.out.println("index ----2 "+emplist.get(2));
 	    
 	    System.out.println(emplist);
	}
}
