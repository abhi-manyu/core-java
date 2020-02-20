package com.oops.inheritance.constChain;


public class Child extends Parent
{
	int j;
	public Child(int number)
	{
		this.j = number;
		System.out.println(super.i);
	}
    public static void main(String[] args)
    {
    	Child c = new Child(20);
    	
    	System.out.println(c.i);
		System.out.println(c.j);
	}
}
