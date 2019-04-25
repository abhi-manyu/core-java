package com.collection.LIst;

public class Employee {
   private int id;
   private String name;
   private String phone;
   public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
   public String toString()
   {
	   return "id : "+id+", name : "+name+", phone : "+phone+"\n";
   }
}
