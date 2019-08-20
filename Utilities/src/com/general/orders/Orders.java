package com.general.orders;

public class Orders {

	static {
		System.out.println("hii i m from statric block");
	}
	public Orders() {
		System.out.println("i m from default constuctor");
	}
	public static void main(String[] args)
	{
		System.out.println("hii i m from main method");
		Orders o = new Orders();
	}
	{
		System.out.println("hiii i m from non static block");
	}
	public static void staticdisplay()
	{
		System.out.println("hii i m from static method");
	}
	public void nonstaticdisplay()
	{
		System.out.println("hii m from non static method");
	}

}
