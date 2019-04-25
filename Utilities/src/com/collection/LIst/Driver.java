package com.collection.LIst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Driver
{
	static List<Employee> emplist=new ArrayList<>();
   public static void main(String[] args) {

	   Employee emp1=new Employee(1,"abhi","165416565");
	   Employee emp2=new Employee(2,"arabinda","241652474");
	   Employee emp3=new Employee(3,"anshuraj","14789632");
	   /*Employee emp4=new Employee(4,"Ashok","14789632");
	   Employee emp5=new Employee(5,"Anirudha","14789632");*/
	   
	   
	
	emplist.add(emp1);
	emplist.add(emp2);
	emplist.add(emp3);
	/*emplist.add(emp4);
	emplist.add(emp5);*/
	//System.out.println(emplist);
	
	replace(1,new Employee(10,"mark","54632454"));
	//System.out.println(emplist);
	
	
}
   public static void replace (int id,Employee emp)
	{
	   int index=0;
	   Iterator<Employee> itr=emplist.iterator();
	   while(itr.hasNext())
	   {
		   Employee tempemp=itr.next();
		   if(tempemp.getId()==id)
		   {
			 index=emplist.indexOf(tempemp);
			  itr.remove();
			  System.out.println("deleted "+emplist.get(index));
			  System.out.println("the element in index----2 : "+emplist.get(2));
		   }
	   }
	  emplist.add(index, emp);
	}
}
