package com.oops.inheritance.hashCode;

public class Fruits {
  
	public Fruits() {
		System.out.println("inside super class default constructor");
		System.out.println("the super class object has code is : "+this.hashCode());
		System.out.println("class name is : "+this.getClass().getName());
	}
}
