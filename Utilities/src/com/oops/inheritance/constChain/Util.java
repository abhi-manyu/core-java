package com.oops.inheritance.constChain;

public class Util
{
	//here that same 'i' variable from parent class is accessing from child class as well
	//so while changing the 'i' value from the child class is affecting the parent class
	//'i' value as well, because it is the same i only.
	public static void main(String[] args)
	{
       Child ch1= new Child();
       ch1.i=10;
       ch1.display();
	}
}
