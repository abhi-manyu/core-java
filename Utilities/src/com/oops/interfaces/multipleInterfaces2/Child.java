package com.oops.interfaces.multipleInterfaces2;

public class Child implements Parent1, Parent2 {
	
	public static void main(String[] args)
	{
		Parent1 ch = new Child();
		ch.print();
		
		Parent1.whereAreYou();
	}

	
	// either implementation is provided as default method or not, still we need to override the method
	// present in the interface, or else we will get error.
	
	@Override
	public void print() {
		Parent2.super.print();
		System.out.println("in child class print() method");
		Parent2.whereAreYou();
	}

}
