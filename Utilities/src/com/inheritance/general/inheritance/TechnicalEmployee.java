package com.inheritance.general.inheritance;

public class TechnicalEmployee extends Employee
{
    String dept;
    String manager;
   
   public TechnicalEmployee() {
	// TODO Auto-generated constructor stub
    }

public TechnicalEmployee(String dept, String manager) {
	super();
	this.dept = dept;
	this.manager = manager;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getManager() {
	return manager;
}

public void setManager(String manager) {
	this.manager = manager;
}
   
   
}
