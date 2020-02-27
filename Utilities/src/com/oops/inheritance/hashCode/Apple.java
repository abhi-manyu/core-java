package com.oops.inheritance.hashCode;

public class Apple extends Fruits {

	public Apple() {
		System.out.println("inside child class default constructor");
		System.out.println("the child class object has code is : "+this.hashCode());
		System.out.println("class name is : "+this.getClass().getName());
	}
}
