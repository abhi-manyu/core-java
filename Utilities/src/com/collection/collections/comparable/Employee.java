package com.collection.collections.comparable;

public class Employee implements Comparable<Employee>
{
   private int id;
   private String name;
   
   public Employee() {
	// TODO Auto-generated constructor stub
   }

public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
   
   @Override
	public String toString()
   {
		return id+"---"+name+"\n";
	}

   //this is not going to work
@Override
public int compareTo(Employee o) {
	Employee emp=(Employee)o;
	if(this.id >emp.id)
		return -1;
	else if(this.id<emp.id)
		return 1;
	else
		return 0;
   }
}
