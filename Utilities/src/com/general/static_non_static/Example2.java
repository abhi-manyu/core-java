package com.general.static_non_static;

public class Example2 {

	public static void main(String[] args) {
		E obj = new E();
		obj.i=50;
		obj.display();
	}
}

class E{
	int i;
	void display()
	{
		System.out.println(i);
		E e1= new E();
		System.out.println(e1.i);
	}
}
