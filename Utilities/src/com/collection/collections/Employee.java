package com.collection.collections;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private String address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" address : "+address+"\n";
	}

	@Override
	public int compareTo(Employee emp) {
		
		return this.name.compareTo(emp.getName());
	}


}
