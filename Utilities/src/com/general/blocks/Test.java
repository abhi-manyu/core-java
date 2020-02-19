package com.general.blocks;


class Test
{
	static
	{
		System.out.println("inside static block");
	}
	
	{
		System.out.println("inside non static block");
	}
	
	public Test()
	{
		System.out.println("inside default constructor");
	}
	
	public Test(String name)
	{
		System.out.println("inside parameterize constructor with name : "+name);
	}
	
	static void staticDisplayMethod()
	{
		System.out.println("inside static method");
	}
	void nonstaticDisplayMethod()
	{
		System.out.println("inside non static method ");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main starts");
		staticDisplayMethod();
		Test t= new Test();
		t.nonstaticDisplayMethod();
		System.out.println("main ends");
	}
}
