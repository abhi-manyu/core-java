package com.oops.inheritance.upcasting;

public class Employee
{
    int id;
    String name;
    double salary;
   public Employee() {
	// TODO Auto-generated constructor stub
   }
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

   public void display(Employee emp)
   {
	   System.out.println(emp.getId()+"---"+emp.getName()+"----"+emp.getSalary());
	   if(emp instanceof TechnicalEmployee)
		   System.out.println(((TechnicalEmployee)emp).getManager()+"---"+
	             ((TechnicalEmployee)emp).getDept());
	   else
		   System.out.println(((NonTechnical)emp).getManager()+"---"+
		             ((TechnicalEmployee)emp).getDept());
   }
   
}
