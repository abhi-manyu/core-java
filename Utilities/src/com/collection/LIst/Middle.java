package com.collection.LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Middle
{
   static List<Employee> li;
   public Middle() {
	li=new ArrayList<>();
	li.add(new Employee(101,"abc","13544565"));
	li.add(new Employee(201,"def","98745678"));
	li.add(new Employee(301,"fgh","96321457"));
}
   public List<Employee> getAllList()
   {
	   return li;
   }
   public Employee getAEmployee(int id)
   {
	   Iterator<Employee> itr=li.iterator();
	   while(itr.hasNext())
	   {
		   Employee em=itr.next();
		   if(em.getId()==id)
			   return em;
	   }
	   return null;
   }
   
   public List<Employee> addNewEmployee(Employee emp)
   {
	   li.add(emp);
	   System.out.println("employee adding successful");
	   return li;
   }
   
   
}
