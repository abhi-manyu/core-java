package com.oops.inheritance.callToSuper;

public class College extends Universsity{
  
	int boys,girls;
	/*
	 * public College() { System.out.println("inside College constructor"); }
	 */
	
	public College(int boys, int girls) {
		super();
		this.boys = boys;
		this.girls = girls;
	}
    void display()
    {
    	System.out.println("noof boys : "+boys+" and number of girls : "+girls);
    }
}
