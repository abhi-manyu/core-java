package com.oops.inheritance.upcasting;

public class Client
{
	public static void main(String[] args)
	{
        Employee emp=new TechnicalEmployee("Development","Roger");
        emp.setId(121);
        emp.setName("Steve");
        emp.setSalary(45000.00);
        emp.display(emp);
        
	}
}
