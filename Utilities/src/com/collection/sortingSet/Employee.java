package com.collection.sortingSet;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
      
	private int id;
    private String name;
    private int age;
    public Employee(int id, String name, int age) {
          this.id=id;
          this.name=name;
          this.age=age;
          
    }
    public int getId() {
          return id;
    }
    
    public String getName() {
          return name;
    }
    
    public int getAge() {
          return age;
    }
	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getId()>emp2.getId())
			return -1;
		else if(emp1.getId()<emp2.getId())
			return 1;
		else return 0;
	}
	/*@Override
	public int compareTo(Employee emp1) {
		if(emp1!=null)
		{
			if(emp1.getId()>this.getId())
				return 1;
			else if(emp1.getId()<this.getId())
				return -1;
			else return 0;
		}
		return -1;
	}*/

}
