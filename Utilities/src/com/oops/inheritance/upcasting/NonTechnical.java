package com.oops.inheritance.upcasting;

public class NonTechnical extends Employee
{
   private String dept;
   private String Manager;
   public NonTechnical() {
	// TODO Auto-generated constructor stub
   }
public NonTechnical(String dept, String manager) {
	super();
	this.dept = dept;
	Manager = manager;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getManager() {
	return Manager;
}
public void setManager(String manager) {
	Manager = manager;
}
   
}
